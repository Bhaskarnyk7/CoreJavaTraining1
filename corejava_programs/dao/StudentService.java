package com.evergent.corejava.dao;

public class StudentService {
	public int addStdService(int stdId,String stdName,int stdmarks) {
		String grade="";
		if(stdmarks<=40) {
			grade="c";
		}
		else if(stdmarks<=70) {
			grade="b";
		}
		else {
			grade="a";
		}
		
		
		StudentBean sb=new StudentBean();
		sb.setId(stdId);
		sb.setName(stdName);
		sb.setMarks(stdmarks);
		
		StudentDAO sd=new StudentDAO();
		int ur=sd.addStudent(sb);
		return ur;
	}

}
