package de.max.main;

public class Account {

	private String origin;
	private String nameOfOrigin;
	private String name;
	
	public Account(){
		this(null,null,null);
	}
	
	public Account(String origin, String nameOfOrigin, String name){
		super();
		this.origin = origin;
		this.nameOfOrigin = nameOfOrigin;
		this.name = name;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getNameOfOrigin() {
		return nameOfOrigin;
	}
	
	public void setNameOfOrigin(String nameOfOrigin) {
		this.nameOfOrigin = nameOfOrigin;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
