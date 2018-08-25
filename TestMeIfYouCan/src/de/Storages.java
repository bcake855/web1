package de;

public abstract class Storages {

	private int id;
	private String description;
	private String type;
	
	public Storages(int id, String description, String type){
		this.setId(id);
		this.setDescription(description);
		this.setType(type);
		System.out.println("from abstract clss");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
