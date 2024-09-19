package com.evergent.corejava.daojdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class StudentDAO {
	public int addStudent(StudentBean sb) throws Exception{
		Connection con=null;
		con=StudentDB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into std values (?,?,?)");
		ps.setInt(1,sb.getId());
		ps.setString(2, sb.getstdName());
		ps.setInt(3, sb.getmarks());
		int rs=ps.executeUpdate();
		System.out.println(" row 1 succes");
		return rs;
		
	}

}
