package com.ep.Updation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentUpdation 
{
	public int StudentUpdate(StudentBean student) throws ClassNotFoundException, SQLException
	{
		Connection con1 = DBUtil.DBConnection();
		
		//PREPAREDSTATEMENTS
		// the mysql update statement
	    String query = " update StudentBean set name = ?, email = ?, location = ? where id = ?";
		
	    // create the mysql update preparedstatement
	      PreparedStatement stmt = con1.prepareStatement(query);
	    
	      stmt.setString(1, student.getName());
	      stmt.setString(2, student.getEmail());
	      stmt.setString(3, student.getLocation());
	      stmt.setLong(4, student.getId());
	      
	    // execute the preparedstatement
	    int n = stmt.executeUpdate();
	      
		con1.close();
		return n;
	}
}
