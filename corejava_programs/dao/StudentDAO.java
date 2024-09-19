package com.evergent.corejava.dao;

import java.util.ArrayList;

public class StudentDAO {
	public int addStudent(StudentBean sb) {
		ArrayList list=new ArrayList<>();
		list.add(sb.getId());
		list.add(sb.getstdName());
		list.add(sb.getmarks());
		
		System.out.println(list);
		return 1;
	}

}
