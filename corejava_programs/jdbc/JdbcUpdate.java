package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.sql.PreparedStatement;

import javax.lang.model.element.NestingKind;



public class JdbcUpdate {
	public static void main(String[] args) throws Exception {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driverName="com.mysql.jdbc.Driver";
		String dbname="bhaskar1";
		String username="root";
		String password="admin";
		
		Class.forName(driverName);
		con=DriverManager.getConnection(url+dbname,username,password);
		PreparedStatement ps=con.prepareStatement("update student set marks=? where id=?");
		
		ps.setInt(1, 100);
		ps.setInt(2, 1);
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("updated succesfull");
		}
		else {
		System.out.println("not success");
		}
		con.close();
		ps.close();
	
	}

}
