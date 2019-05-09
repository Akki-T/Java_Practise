package com.model;

import java.sql.Date;

public class Student {

	
	
	private int Rollno;
	private String Name;
	private String CurrentClass;
	private Date JoinedOn;
	
	
	
	public Student() {
		super();
	}

	public Student(int rollno, String name, String currentClass) {
		super();
		
		Rollno = rollno;
		Name = name;
		CurrentClass = currentClass;
		
		
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCurrentClass() {
		return CurrentClass;
	}

	public void setCurrentClass(String currentClass) {
		CurrentClass = currentClass;
	}

	public Date getJoinedOn() {
		return JoinedOn;
	}

	public void setJoinedOn(Date joinedOn) {
		JoinedOn = joinedOn;
	}

	
	
	
	
	
	
	
	
}
