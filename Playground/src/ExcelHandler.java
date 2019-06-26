import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class ExcelHandler {

	private static final String mockUp1 = "/home/max/Desktop/mockuptest1.xls";
	private static final String mockUp2 = "/home/max/Desktop/mockuptest2.xls";
	
	public ExcelHandler() {
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			POIFSFileSystem f1 = new POIFSFileSystem(new File(mockUp1));
			POIFSFileSystem f2 = new POIFSFileSystem(new File(mockUp2));
			
			HSSFWorkbook wb1 = new HSSFWorkbook(f1);
			HSSFWorkbook wb2 = new HSSFWorkbook(f1);
			
			HSSFSheet spreadSheet1 = wb1.getSheetAt(0);
			HSSFSheet spreadSheet2 = wb2.getSheetAt(0);
			
			Row row1 = spreadSheet1.getRow(0);
			Row row2 = spreadSheet2.getRow(0);
			
			int usedRowsMockUp1 = spreadSheet1.getLastRowNum();
			int usedRowsMockUp2 = spreadSheet2.getLastRowNum();
			
			int usedCellsMockUp1 = row1.getLastCellNum();
			int usedCellsMockUp2 = row2.getLastCellNum();
			
			ArrayList<String> rowArr1 = new ArrayList<String>();
			ArrayList<String> rowArr2 = new ArrayList<String>();
			
			//if rows and columns equal
			if(usedRowsMockUp1 == usedRowsMockUp2 && usedCellsMockUp1 == usedCellsMockUp2) {
				
				for(int a = 1; a <= usedRowsMockUp1; a++) {
					//start with first data column
					row1 = spreadSheet1.getRow(a);
					row2 = spreadSheet2.getRow(a);
					//write into arrays
					for(int i=1; i <= usedCellsMockUp1; i++) {
						String value = (row1.getCell(i) != null ? row1.getCell(i).toString() : "");
						rowArr1.add( value != null ? value : "" );
					}
					
					//for(int k=1; k < usedCellsMockUp1; k++) {
					//	rowArr2.add(row2.getCell(k).toString());
					//}
					
					for (String string : rowArr1) {
						System.out.print(string);
					}
					System.out.println("");
					
					rowArr1.clear();
				}
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
