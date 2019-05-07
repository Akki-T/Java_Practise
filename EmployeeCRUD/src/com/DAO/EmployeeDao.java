package com.DAO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.Model.Employee;

public class EmployeeDao 
{
	
	public static final String url="jdbc:postgresql://localhost:5432/testdb";
	public String uname ="postgres";
	public String pswd ="postgres";
	Connection con = null;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs =null;
	
	public void addEmployee(Employee E)
	{
	try
	{
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection(url,uname,pswd);
		System.out.println("Connection established");
	//	stmt=con.createStatement();
		String query="insert into employeecrud.TBL_Emp  values(?,?,?,?)";
		ps=con.prepareStatement(query);
		ps.setInt(1, E.getEMPID());
		ps.setString(2, E.getFIRSTNAME());
		ps.setString(3, E.getLASTNAME());
		ps.setInt(4,E.getDEPTID());
		ps.executeUpdate();
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Employee added successfully");
//		finally{
//			
//			try {
//				con.close();
//			} catch (SQLException ex) {
//				// TODO Auto-generated catch block
//				ex.printStackTrace();
//			}
			
//		}
	}
	
	public void UpdateEmployee(int eid, String lname)
	{
		try
		{
			//Date sqlDate = new java.sql.Date(System.currentTimeMillis());
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
		//	stmt=con.createStatement();
			String query="update employeecrud.TBL_Emp set LASTNAME=?,LAST_EDITED=? where EMPID=? ";
			ps=con.prepareStatement(query);
			
			ps.setString(1, lname);
		/*	java.util.Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
            String strDate = dateFormat.format(date);  
            ps.setString(2, strDate);
        */
			//ps.setDate(2,sqlDate );
			java.sql.Date date = getCurrentDatetime();
			ps.setDate(2, date);
			/*Calendar cal = GregorianCalendar.getInstance();
			ps.setDate(2, new Date(cal.getTimeInMillis()), cal);
			*/
			/*java.util.Date utilDate =  new java.util.Date() ;
			java.sql.Date sqlDate = new java.sql.Date(utilDate
					.getTime());
			ps.setDate(2, sqlDate);
			*/
			ps.setInt(3, eid);
			
			
			ps.executeUpdate();
			ps.close();
			con.close();
			}
			catch(Exception e)
			{
				System.err.println(e.getClass().getName()+":"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("Employee details updated successfully");
	}
	
	public void DeleteEmployee(int EMPID)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
		//	stmt=con.createStatement();
			String query="DELETE from employeecrud.TBL_Emp where EMPID=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, EMPID);
			ps.executeUpdate();
			
			ps.close();
			con.close();
			}
			catch(Exception e)
			{
				System.err.println(e.getClass().getName()+":"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("Employee deleted successfully");

	}
	
	
	public void EmployeeDetails()
	{
		try
		{
			//List<Employee> ed=new ArrayList();
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
			System.out.println("***********EMPLOYEE Details**************");
			stmt=con.createStatement();
			String query="SELECT EMPID,FIRSTNAME,LASTNAME,a.DEPTNAME as DEPARTMENTNAME FROM employeecrud.TBL_DEPARTMENT a JOIN employeecrud.TBL_Emp b ON a.DEPTID=b.DEPTID ";
		
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
			
				 int id = rs.getInt("EMPID");
		         String  fname = rs.getString("FIRSTNAME");
		         String  lname = rs.getString("LASTNAME");
		         String  dname = rs.getString("DEPARTMENTNAME");
		         
		            System.out.println( "EmpID = " + id );
		            System.out.println( "FirstNAME = " + fname );
		            System.out.println( "LastNAME = " + lname );
		            System.out.println( "DepartmentName = " + dname );
//		            System.out.println( "Added on = " + date );
//		            System.out.println( "LastModified = " + ldate );
		           
		            System.out.println();
			}
			System.out.println("**************************************************");
			
			stmt.close();
			con.close();
			}
			catch(Exception e)
			{
				System.err.println(e.getClass().getName()+":"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("Employee details fetched succesfully");
	}
	public java.sql.Date getCurrentDatetime() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
		
}
