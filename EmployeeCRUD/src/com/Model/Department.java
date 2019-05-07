package com.Model;

import java.sql.Date;

public class Department {
	
	private int DEPTID;
	private String DEPTNAME;
	private Date CREATED_ON;
	public Department(int dEPTID, String dEPTNAME) {
		super();
		DEPTID = dEPTID;
		DEPTNAME = dEPTNAME;
		//CREATED_ON = cREATED_ON;
	}
	public int getDEPTID() {
		return DEPTID;
	}
	public void setDEPTID(int dEPTID) {
		DEPTID = dEPTID;
	}
	public String getDEPTNAME() {
		return DEPTNAME;
	}
	public void setDEPTNAME(String dEPTNAME) {
		DEPTNAME = dEPTNAME;
	}
	public Date getCREATED_ON() {
		return CREATED_ON;
	}
	public void setCREATED_ON(Date cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}
	
	
}
