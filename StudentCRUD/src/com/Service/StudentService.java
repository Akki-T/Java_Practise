package com.Service;

import java.util.ArrayList;

import com.model.Student;

public interface StudentService {
	
public void addStudent(Student s);
public void editStudent(int id,String whichClass);
public void getStudent(int id);
public ArrayList<Student> getAllStudents();
}
