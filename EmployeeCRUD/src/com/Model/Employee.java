package com.Model;

import java.sql.Date;

public class Employee {

	private int EMPID;
	private String FIRSTNAME ;
	private String LASTNAME  ;
	private int DEPTID ;
	private Date ADDED_ON;
	private Date LAST_EDITED;
	
	public Employee(int eMPID, String fIRSTNAME, String lASTNAME, int dEPTID) {
		super();
		EMPID = eMPID;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		DEPTID = dEPTID;
//		ADDED_ON = aDDED_ON;
//		LAST_EDITED = lAST_EDITED;
	}

	

	public int getEMPID() {
		return EMPID;
	}

	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public int getDEPTID() {
		return DEPTID;
	}

	public void setDEPTID(int dEPTID) {
		DEPTID = dEPTID;
	}

	public Date getADDED_ON() {
		return ADDED_ON;
	}

	public void setADDED_ON(Date aDDED_ON) {
		ADDED_ON = aDDED_ON;
	}

	public Date getLAST_EDITED() {
		return LAST_EDITED;
	}

	public void setLAST_EDITED(Date lAST_EDITED) {
		LAST_EDITED = lAST_EDITED;
	}
	
	
	
}
