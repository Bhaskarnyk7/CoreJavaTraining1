package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {
	public static void main(String[] args) throws Exception {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driverName="com.mysql.jdbc.Driver";
		String dbname="bhaskar1";
		String username="root";
		String password="admin";
		
		Class.forName(driverName);
		con=DriverManager.getConnection(url+dbname,username,password);
		PreparedStatement ps=con.prepareStatement("delete from student where id=?");
		
		ps.setInt(1, 1);   
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("deleted row  succesfull");
		}
		else {
		System.out.println("not success");
		}
		con.close();
		ps.close();
	}
}
