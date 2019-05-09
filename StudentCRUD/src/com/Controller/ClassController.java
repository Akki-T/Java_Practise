package com.Controller;

import java.util.ArrayList;

import com.Dao.ClassDao;
import com.model.ClassD;


public class ClassController {
	
ClassDao cd=new ClassDao();

public void addClass(ClassD c)throws ClassNotFoundException
{
	cd.addClass(c);
}

public void editClassIncharge(int cid,String name){
	cd.updateClassIncharge(cid, name);
}

public void editClassStrength(int cid,int strength){
	cd.updateClassStrength(cid, strength);
}
public void getClassDet(ClassD c){
	cd.getClassDetails(c);
	
}
public void getallClasses(){
	ArrayList<ClassD> allClasses=new ArrayList<ClassD>();
	allClasses=cd.getAllClassDet();
	for(ClassD c1: allClasses)
	{
		System.out.println("Class Number: "+c1.getClassNumber());
		System.out.println("Class incharge: "+c1.getClassIncharge());
		System.out.println("Class Strenght: "+c1.getClassStrength());
		
	}
}
}
