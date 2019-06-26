import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class ExcelHandler {

	private static final String mockUp1 = "/home/max/Desktop/mockuptest1.xls";
	private static final String mockUp2 = "/home/max/Desktop/mockuptest2.csv";
	
	public ExcelHandler() {
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			POIFSFileSystem f1 = new POIFSFileSystem(new File(mockUp1));
			HSSFWorkbook wb = new HSSFWorkbook(f1);
			
			HSSFSheet spreadSheet1 = wb.getSheetAt(0);
			HSSFSheet spreadSheet2 = wb.getSheetAt(0);
			
			Row row1 = spreadSheet1.getRow(0);
			Row row2 = spreadSheet2.getRow(0);
			
			
			
			for(int i=1; i < row1.getLastCellNum(); i++) {
				System.out.println(row1.getCell(i)); 
				
				//for(int k=1; k < row2.getLastCellNum(); k++) {
					//if at least one match than print
					// if(!row1.getCell(i).equals(row2.getCell(k))) {
						// System.out.println(row2.getCell(k));
					 //}
				//}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
