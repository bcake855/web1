package picam;

public class GPIO {
	
	private boolean active = false;
	private int id;
	private int width;
	private int height;
	private int frequency;
	

	public GPIO() {
		
	}

	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getId() {
		return id;
	}


	public void setId(int i) {
		this.id = i;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	

}
