package de;

public class AmazonStorage extends Storages {

	private String bucket;
	private String login;
	private String secretKey;
	private String region;
	
	public AmazonStorage(int id, String description, String type) {
		super(id, description, type);
		// TODO Auto-generated constructor stub
	}
	

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public String printStuff(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("Bucket: ");
		sb.append(this.bucket + ", ");
		sb.append("Login: ");
		sb.append(this.login + ", ");
		sb.append("Key: ");
		sb.append(this.secretKey + ", ");
		sb.append("Region: ");
		sb.append(this.region);
		
		return sb.toString();
	}
	
	
	
	public static void main(String[] args){
		
		AmazonStorage amastl  = new AmazonStorage(1, "My amazon secret storage", "remote");
		amastl.setBucket("OolongBucket");
		amastl.setLogin("madmax");
		amastl.setSecretKey("topsecretKey");
		amastl.setRegion("bw");
				
		System.out.println(amastl.printStuff());
		System.out.println(amastl.getDescription());
		System.out.println(amastl.getType());
		
	}
}
