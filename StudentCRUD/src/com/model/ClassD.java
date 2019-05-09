package com.model;

public class ClassD {
	int ClassNumber;
	String ClassIncharge;
	int ClassStrength;
	public ClassD(int classNumber, String classIncharge, int classStrength) {
		super();
		ClassNumber = classNumber;
		ClassIncharge = classIncharge;
		ClassStrength = classStrength;
	}
	
	
	public ClassD() {
		super();
	}


	public int getClassNumber() {
		return ClassNumber;
	}
	public void setClassNumber(int classNumber) {
		ClassNumber = classNumber;
	}
	public String getClassIncharge() {
		return ClassIncharge;
	}
	public void setClassIncharge(String classIncharge) {
		ClassIncharge = classIncharge;
	}
	public int getClassStrength() {
		return ClassStrength;
	}
	public void setClassStrength(int classStrength) {
		ClassStrength = classStrength;
	}
	
	
	

}
