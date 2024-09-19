package com.evergent.corejava.daojdbc;

public class StudentBean {
	private  int StdId;
	private String stdName;
	private int stdmarks;
	
	public void setId(int StdId) {
		this.StdId=StdId;
	}
	public void setName(String stdName) {
		this.stdName=stdName;
	}
	public void setMarks(int stdmarks) {
		this.stdmarks=stdmarks;
	}
	
	public int getId() {
		return StdId;
	}
	public String getstdName() {
		return stdName;
	}
	public int getmarks() {
		return stdmarks;
	}
	
	
}
