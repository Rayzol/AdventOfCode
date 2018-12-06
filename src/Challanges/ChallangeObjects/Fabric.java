package Challanges.ChallangeObjects;

public class Fabric {

	public Fabric() {}
	
	private int id;
	private int topStart;
	private int leftStart;
	private int width;
	private int height;
	
	public void createFabric(String fabricInput){
		
		String[] splitString = fabricInput.substring(1).split("[^\\d]+");
		
		this.id = Integer.parseInt(splitString[0]);
		
		this.leftStart = Integer.parseInt(splitString[1]);
		
		this.topStart = Integer.parseInt(splitString[2]);
		
		this.width = Integer.parseInt(splitString[3]);
		
		this.height = Integer.parseInt(splitString[4]);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTopStart() {
		return topStart;
	}

	public void setTopStart(int topStart) {
		this.topStart = topStart;
	}

	public int getLeftStart() {
		return leftStart;
	}

	public void setLeftStart(int leftStart) {
		this.leftStart = leftStart;
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
	
}
