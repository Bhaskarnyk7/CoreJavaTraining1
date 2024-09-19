package com.evergent.corejava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.evergent.corejava.bean.CollegeBean;



public class CollegeDAO {
	Connection con=null;
	PreparedStatement pstmt=null;
	public static int createAcc(CollegeBean obj)
	{
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=CollegeDBConnection.getConnection(); 
			  
			  String ins_str ="insert into std values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,obj.getStdid());
			  pstmt.setString(2,obj.getStdname());
			  pstmt.setString(3, obj.getStdbranch());
			  pstmt.setInt(4,obj.getYear());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	}
	public static void showB(int stdid)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			//double balance=0;
			con=CollegeDBConnection.getConnection();
			String ins_str="select * from std where stdid=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, stdid);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					//balance=rs.getDouble(1);
				System.out.println("student id no "+rs.getInt(1));
				System.out.println("student name is "+rs.getString("stdname"));
				System.out.println("student branch "+rs.getString(3));
				System.out.println("student year "+rs.getInt(4));
				}
			con.close();
			//return balance;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			//return 0;
		}
		
	}
	// created method for searching book entered by user in db
	
	public static int searchBookCSE(String sub1)
	{
		String p="";
		Connection con=null;
		int pr=0;
		//PreparedStatement pstmt=null;
		try {
			con=CollegeDBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select price from cse where sub=?");
			//pstmt=con.prepareStatement(ins_str);
			ps.setString(1, sub1);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				{
				pr=rs.getInt(1);
				//p=String.valueOf(pr);
				}
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			//return 0;
		}
		return pr;
		
	}
	
	
	// ece search book
	public static int searchBookECE(String sub1)
	{
		String p="";
		Connection con=null;
		int pr=0;
		//PreparedStatement pstmt=null;
		try {
			con=CollegeDBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select price from ece where sub=?");
			//pstmt=con.prepareStatement(ins_str);
			ps.setString(1, sub1);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				{
				pr=rs.getInt(1);
				//p=String.valueOf(pr);
				}
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			//return 0;
		}
		return pr;
		
	}
	
	
}
