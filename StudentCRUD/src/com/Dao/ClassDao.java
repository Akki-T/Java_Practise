package com.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.Service.ClassService;
import com.model.ClassD;

import com.util.dbutil;



public class ClassDao implements ClassService {

	private Connection conn;
	private PreparedStatement psmt;
	private Statement stmt;
	private ResultSet rs;
	
	public void addClass(ClassD c)
	{
		try
	{
		conn=dbutil.getConnection();
		String query="insert into studentcrud.class  values(?,?,?)";
		psmt=conn.prepareStatement(query);
		psmt.setInt(1, c.getClassNumber());
		psmt.setString(2, c.getClassIncharge());
		psmt.setInt(3,c.getClassStrength());
		psmt.executeUpdate();
		psmt.close();
		conn.close();
		
	}
	
	catch(Exception e)
	{
		System.err.println(e.getClass().getName()+":"+e.getMessage());
		e.printStackTrace();
		System.exit(0);
	}
		
	}
	public void updateClassIncharge(int cid, String name){
		try
		{
			conn=dbutil.getConnection();
			String query="update studentcrud.class set ClassIncharge=? where  ClassNumber=? ";
			psmt=conn.prepareStatement(query);
			
			psmt.setString(1,name);
			psmt.setInt(2, cid);
			
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void updateClassStrength(int cid, int str){ 
		try
		{
			conn=dbutil.getConnection();
			String query="update studentcrud.class set ClassStrength=? where  ClassNumber=? ";
			psmt=conn.prepareStatement(query);
			
			psmt.setInt(1,str);
			psmt.setInt(2, cid);
			
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
	public void getClassDetails(ClassD c){
		try
		{
			conn=dbutil.getConnection();
			String query="select * from studentcrud.class where  Rollno= ? ";
			psmt=conn.prepareStatement(query);
			psmt.setInt(1, c.getClassNumber());
			rs = psmt.executeQuery();
			
			while(rs.next()){
			
				 int id = rs.getInt("ClassNumber");
		         String  fname = rs.getString("ClassIncharge");
		         int  cClass = rs.getInt("ClassStrength");
		        
		         
		            System.out.println( "Class = " + id );
		            System.out.println( " ClassInchargeFullNAME = " + fname );
		            System.out.println( "ClassStrength = " + cClass );
		           
		          
		           
		            System.out.println();
			}
			psmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
	public ArrayList<ClassD> getAllClassDet(){
		
		ArrayList<ClassD> result=new ArrayList<ClassD>();
		try
		{
			conn=dbutil.getConnection();
			stmt=conn.createStatement();
			String query="select * from studentcrud.Class";
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
			ClassD s=new ClassD();

				s.setClassNumber(rs.getInt("ClassNumber"));
				s.setClassIncharge(rs.getString("classIncharge"));
				s.setClassStrength(rs.getInt("classStrength"));
				
		        result.add(s);
			}
			psmt.close();
			conn.close();	
			
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		
		return result;
	}
}
