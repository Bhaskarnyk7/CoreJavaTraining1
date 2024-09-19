package com.evergent.corejava.daojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDB {
	public static Connection getConnection() throws Exception{
	Connection con=null;
	String url="jdbc:mysql://localhost:3306/";
	String driverName="com.mysql.jdbc.Driver";
	String dbname="dao";
	String username="root";
	String password="admin";
	Class.forName(driverName);
	con=DriverManager.getConnection(url+dbname,username,password);
	
	return con;
}
}
