package com.ep.Deletion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ep.Bean.StudentBean;
import com.ep.Connection.DBUtil;

public class StudentDeletion 
{
	public int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException
	{
		Connection con1 = DBUtil.DBConnection();
		
		//PREPAREDSTATEMENTS
		// the mysql delete statement
		// the mysql insert statement
	      String query = " delete from StudentBean where id = (?) ";
		
		
	    // create the mysql delete preparedstatement
	      PreparedStatement preparedStmt = con1.prepareStatement(query);
	      
	      preparedStmt.setLong (1, student.getId());
	      
	    // execute the preparedstatement
	      int n = preparedStmt.executeUpdate();
	      
		con1.close();
		return n;
	}

}
