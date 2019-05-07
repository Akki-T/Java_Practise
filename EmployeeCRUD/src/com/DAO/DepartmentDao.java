package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Model.Department;

public class DepartmentDao {

	public static final String url="jdbc:postgresql://localhost:5432/testdb";
	public String uname ="postgres";
	public String pswd ="postgres";
	Connection con = null;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs =null;
	
	public void addDepartment(Department d)
	{
		try{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection(url,uname,pswd);
		System.out.println("Connection established");
		String query="insert into employeecrud.TBL_DEPARTMENT  values(?,?)";
		
		ps=con.prepareStatement(query);
		
		ps.setInt(1, d.getDEPTID());
		ps.setString(2, d.getDEPTNAME());
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
		System.out.println("department added successfully");
			
		}
	public void UpdateEmployee(int did, String dname)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
			
			String query="update employeecrud.TBL_department set DEPTNAME=? where DEPTID=?";
			ps=con.prepareStatement(query);
			
			ps.setString(1, dname);
			ps.setInt(2, did);
			
			
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
			System.out.println("Department details updated successfully");
	}
	
	public void DeleteDepartment(int DEPTID)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
			
			String query="DELETE from employeecrud.TBL_department where DEPTID=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, DEPTID);
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
			System.out.println("Department deleted successfully");

	}
	
	
	public void DepartmentDetails()
	{
		try
		{
			
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,uname,pswd);
			System.out.println("Connection established");
			stmt=con.createStatement();
			String query="Select * from employeecrud.TBL_department ";
		
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
			
				
				 int depid = rs.getInt("DEPTID");
		         String  dname = rs.getString("DEPTNAME");
		         String date = rs.getString("CREATED_ON");
		        
		         System.out.println( "departmentID = " + depid );         
		            System.out.println( "DEPTNAME = " + dname );
		            System.out.println( "Created on = " + date );
		            
		            System.out.println();
			}
			
			stmt.close();
			con.close();
			}
			catch(Exception e)
			{
				System.err.println(e.getClass().getName()+":"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("Department deleted successfully");
	}
}
