package com.Controller;

import java.util.ArrayList;

import com.Dao.StudentDao;
import com.model.Student;

public class MainController {
	
StudentDao sd=new StudentDao();

public void addStudent(Student s)throws ClassNotFoundException
{
	sd.addStudent(s);
}

public void updateStudent(int id,String whichClass){
	sd.editStudent(id, whichClass);
}
public void getStudent(int id){
	sd.getStudent(id);
	
}
public void getAllStudents(){
	ArrayList<Student> allStudents=new ArrayList<Student>();
	allStudents=sd.getAllStudents();
	for(Student s1: allStudents)
	{
		System.out.println("StudentName: "+s1.getName());
		System.out.println("Roll number: "+s1.getRollno());
		System.out.println("Class Details: "+s1.getCurrentClass());
		System.out.println("Joined School: "+s1.getJoinedOn());
	}
}
}
