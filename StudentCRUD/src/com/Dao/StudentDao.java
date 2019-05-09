package com.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Service.StudentService;
import com.model.Student;
import com.util.dbutil;

public class StudentDao implements StudentService {
private Connection conn;
private PreparedStatement psmt;
private Statement stmt;
private ResultSet rs;
	public void addStudent(Student s){
		try
		{
			conn=dbutil.getConnection();
			String query="insert into studentcrud.student  values(?,?,?)";
			psmt=conn.prepareStatement(query);
			psmt.setInt(1, s.getRollno());
			psmt.setString(2, s.getName());
			psmt.setString(3,s.getCurrentClass());
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
		
//		finally{
//			if(conn!=null)
//				try {
//					psmt.close();
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
	}
	
	
	public void editStudent(int sid, String CurrClass){
		try
		{
			conn=dbutil.getConnection();
			String query="update studentcrud.student set Currentclass=? where  Rollno=? ";
			psmt=conn.prepareStatement(query);
			
			psmt.setString(1,CurrClass);
			psmt.setInt(2, sid);
			
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
//		finally{
//			if(conn!=null)
//				try {
//					psmt.close();
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
	}
	
	public void getStudent(int sid)
	{
		try
		{
			conn=dbutil.getConnection();
			String query="select * from studentcrud.student where  Rollno= ? ";
			psmt=conn.prepareStatement(query);
			psmt.setInt(1, sid);
			rs = psmt.executeQuery();
			
			while(rs.next()){
			
				 int id = rs.getInt("Rollno");
		         String  fname = rs.getString("Name");
		         String  cClass = rs.getString("CurrentClass");
		         Date  date = rs.getDate("JoinedOn");
		         
		            System.out.println( "Rollno = " + id );
		            System.out.println( "Name = " + fname );
		            System.out.println( "CurrentClass = " + cClass );
		            System.out.println( "Joined on = " + date );
		          
		           
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
//		finally{
//			if(conn!=null)
//				try {
//					psmt.close();
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
	}
	public ArrayList<Student> getAllStudents()
	{
		ArrayList<Student> result=new ArrayList<Student>();
		try
		{
			conn=dbutil.getConnection();
			stmt=conn.createStatement();
			String query="select * from studentcrud.student;";
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
			Student s=new Student();

				s.setRollno(rs.getInt("Rollno"));
				s.setName(rs.getString("Name"));
				s.setCurrentClass(rs.getString("CurrentClass"));
				s.setJoinedOn(rs.getDate("JoinedOn"));
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
//		finally{
//			if(conn!=null)
//				try {
//					psmt.close();
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
		return result;
		
		
		
		
		
		
		
	}
}
