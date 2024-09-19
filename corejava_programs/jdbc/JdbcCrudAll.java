package com.evergent.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcCrudAll {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("select 1 to :Print Data");
		
		System.out.println("select 2 to :INSERT");
		
		System.out.println("select 3 to :UPDATE");
		
		System.out.println("select 4 to :Delete");
		
		System.out.println("select 5 to :Exit ");
		int d=sc.nextInt();
		
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driverName="com.mysql.jdbc.Driver";
		String dbname="bhaskar2";
		String username="root";
		String password="admin";
		Class.forName(driverName);
		con=DriverManager.getConnection(url+dbname,username,password);
		boolean flag=true;
		
		
		
		switch(d) {
		
		  case 1:
			
			PreparedStatement ps1=con.prepareStatement("select * from student1");
			ResultSet rs=ps1.executeQuery();
			
			while(rs.next()) {
				System.out.println("student id no "+rs.getInt(1));
				System.out.println("student name is "+rs.getString("name"));
				System.out.println("student marks "+rs.getInt(3));
			}
			
			break;
		  case 2:
			  PreparedStatement ps2=con.prepareStatement("insert into student1 values (?,?,?)");
				ps2.setInt(1, 2);
				ps2.setString(2, "bhaskar");
				ps2.setInt(3, 20);
				
				int i =ps2.executeUpdate();
				System.out.println(" row 1 succes");
//				ps2.setInt(1, 2);
//				ps2.setString(2, "hameed");
//				ps2.setInt(3, 22);
//				
//				i =ps2.executeUpdate();
//				System.out.println("row 2 succes");
				
			break;
		  case 3:
			  PreparedStatement ps3=con.prepareStatement("update student1 set marks=? where id=?");
				
				ps3.setInt(1, 100);
				ps3.setInt(2, 1);
				int i2=ps3.executeUpdate();
				
				if(i2>0) {
					System.out.println("updated succesfull");
				}
				else {
				System.out.println("not success");
				}
				
		  break;
		
		  case 4:
			  PreparedStatement ps4=con.prepareStatement("delete from student1 where id=?");
				
				ps4.setInt(1, 1);   
				int i3=ps4.executeUpdate();
				
				if(i3>0) {
					System.out.println("deleted row  succesfull");
				}
				else {
				System.out.println("not success");
				}
				
		  break;
		
		case 5:
			flag=false;
			break;
		default:
			flag=false;
			break;
		
		}	
		
		}
	}


