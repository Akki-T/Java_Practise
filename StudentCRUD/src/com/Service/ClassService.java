
package com.Service;

import java.util.ArrayList;

import com.model.ClassD;
import com.model.Student;

public interface ClassService {

	
	public void addClass(ClassD c);
	public void updateClassIncharge(int cid, String name);
	public void updateClassStrength(int cid, int str);
	public void getClassDetails(ClassD c);
	public ArrayList<ClassD> getAllClassDet();
	
}
