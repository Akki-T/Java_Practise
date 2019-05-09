package com;

import com.Controller.ClassController;
import com.Controller.MainController;
import com.model.ClassD;
import com.model.Student;


public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
		MainController mc=new MainController();
		ClassController cc=new ClassController();
		
		System.out.println("adding class details");
		ClassD c1=new ClassD(1,"abc",40);
		cc.addClass(c1);
		
		
		ClassD c2=new ClassD(2,"abc1",30);
		cc.addClass(c2);
		
		ClassD c3=new ClassD(3,"abc3",50);
		cc.addClass(c3);
		
		ClassD c4=new ClassD(4,"abc3",40);
		cc.addClass(c4);
		
		System.out.println("get all class details");
		cc.getallClasses();
		
		
		System.out.println("adding students");
		Student student1=new Student(1, "test", "1st");
		mc.addStudent(student1);
		System.out.println("student1 added");
		Student student2=new Student(2, "test2", "2nd");
		mc.addStudent(student2);
		System.out.println("student2 added");
		
		mc.getAllStudents();
		
		System.out.println("updating student");
		mc.updateStudent(2, "4th");
		
		
		System.out.println("get student details");
		mc.getStudent(2);
		
		System.out.println("all student details");
		mc.getAllStudents();
		
		

	}

}
