package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JdbcInsert {
		public static void main(String[] args) throws Exception {
			Connection con=null;
			String url="jdbc:mysql://localhost:3306/";
			String driverName="com.mysql.jdbc.Driver";
			String dbname="bhaskar1";
			String username="root";
			String password="admin";
			
			
			Class.forName(driverName);
			con=DriverManager.getConnection(url+dbname,username,password);
			
			PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "bhaskar");
			ps.setInt(3, 20);
			
			int i =ps.executeUpdate();
			System.out.println(" row 1 succes");
			ps.setInt(1, 2);
			ps.setString(2, "hameed");
			ps.setInt(3, 22);
			
			i =ps.executeUpdate();
			System.out.println("row 2 succes");
			
			con.close();
			ps.close();
					
			
			
			
		}
	}


