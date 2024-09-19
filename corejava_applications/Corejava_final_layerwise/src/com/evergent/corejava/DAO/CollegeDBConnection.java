package com.evergent.corejava.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class CollegeDBConnection {
	public static Connection getConnection() throws Exception{
		
			String url="jdbc:mysql://localhost:3306/";
			String dbname="clg";
			String uname="root";
			String paswd="admin";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url+dbname,uname,paswd);
		return con;
	}
}
