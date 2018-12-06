package Challanges.ChallangeObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public String runRegex(String s, String pattern) {
		String foundString = "";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		
		if(m.find()) {
			int groupLength = m.group().length();
			foundString = m.group().subSequence(1, (groupLength > 2 ? m.group().length()-1 : m.group().length())).toString();
		}
		
		return foundString.trim();
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
