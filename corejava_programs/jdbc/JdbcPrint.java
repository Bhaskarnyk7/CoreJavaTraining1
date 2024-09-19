package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class JdbcPrint {
	public static void main(String[] args) throws Exception {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driverName="com.mysql.jdbc.Driver";
		String dbname="bhaskar1";
		String username="root";
		String password="admin";
		
		Class.forName(driverName);
		con=DriverManager.getConnection(url+dbname,username,password);
		PreparedStatement ps=con.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("student id no "+rs.getInt(1));
			System.out.println("student name is "+rs.getString("name"));
			System.out.println("student marks "+rs.getInt(3));
		}
		con.close();
		ps.close();
				
		
		
		
	}
}
