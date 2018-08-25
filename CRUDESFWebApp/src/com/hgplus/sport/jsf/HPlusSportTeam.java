package com.hgplus.sport.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="team", eager=true)
@SessionScoped
public class HPlusSportTeam implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String EMPLOYEES_FILE = "employees.txt";
	private final String SEPERATOR = ";";
	private final int DEFAULT_ID = 1001;
	
	private Employee employee;
	private List<Employee> employeeList = new ArrayList<Employee>();
	private FileUtils file;
	
	private int lastEmployeeID;
	private String breadCrumb;
	
	public HPlusSportTeam() {
		init();
	}

	public void init(){
		this.file = new FileUtils(EMPLOYEES_FILE, SEPERATOR);
		setUpEmployeeList();
	}
	
	public String response(){
		return breadCrumb + "?faces-redirect=true";
	}
	
	public void action(ActionEvent e){
		breadCrumb = (String)e.getComponent().getAttributes().get("breadCrumb");
	}
	
	public String add(){
		
		if(employee.getUploadedFile() != null){
			file.saveFile(employee.getUploadedFile());
			employee.setPhoto(file.getUploadedFileName());
		}
		
		int id = employeeList.isEmpty() ? DEFAULT_ID : getLastEmployeeID()+1;
		employee.setID(id);
		employeeList.add(employee);
		
		employee = new Employee();
		
		return "dashboard.xhtml?faces-redirect=true";
	}
	
	public String edit(Employee employee){
		this.employee = employee;
		return "edit.xhtml?faces-redirect=true";
	}
	
	public String saveEdit(){
		
		if(employee.getUploadedFile() != null){
			file.saveFile(employee.getUploadedFile());
			employee.setPhoto(file.getUploadedFileName());
		}
		
		return"dashboard.xhtml?faces-redirect=true";
	}
	
	public String delete(Employee employee){
		employeeList.remove(employee);
		
		return "dashboard?faces-redirect=true";
	}
	
	public void setUpEmployeeList(){
		List<String> line = this.file.getDataList();
		
		Iterator<String> itr = line.iterator();
		
		while(itr.hasNext()){
			
			String[] data = itr.next().toString().split(SEPERATOR);
			int i = 0;
			
			employee = new Employee();
			employee.setID(Integer.parseInt(data[i++]));
			employee.setFirstName(data[i++]);
			employee.setLastName(data[i++]);
			employee.setDegree(data[i++]);
			employee.setTitle(data[i++]);
			employee.setPhoto(data[i++]);
			employee.setDescription(data[i++]);
			
			employeeList.add(employee);
			
		}
		
		employee = new Employee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getEMPLOYEES_FILE() {
		return EMPLOYEES_FILE;
	}


	public String getSEPERATOR() {
		return SEPERATOR;
	}


	public FileUtils getFile() {
		return file;
	}


	public void setFile(FileUtils file) {
		this.file = file;
	}

	public int getDEFAULT_ID() {
		return DEFAULT_ID;
	}

	public int getLastEmployeeID() {
		setLastEmployeeID();
		return lastEmployeeID;
	}

	public void setLastEmployeeID() {
		this.lastEmployeeID = employeeList.get(employeeList.size()-1).getID();
	}

	public String getBreadCrumb() {
		return breadCrumb;
	}

	public void setBreadCrumb(String breadCrumb) {
		this.breadCrumb = breadCrumb;
	}

}
