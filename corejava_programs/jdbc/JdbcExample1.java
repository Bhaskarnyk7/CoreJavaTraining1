package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "bhaskar1";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "admin";
	    
	          Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
	          conn = DriverManager.getConnection(url+dbName, userName, password);
	         
	            Statement stmt = conn.createStatement();                
	            ResultSet rs=stmt.executeQuery("Select * from student");
	                while(rs.next()){
	          	 System.out.println("student idNo :" + rs.getInt(1));
	               System.out.println("student Name :" + rs.getString("name"));
	          	    	System.out.println("student marks :"+rs.getInt(3));
	            }         
	                
	         
	          conn.close();
	       
	}

}
