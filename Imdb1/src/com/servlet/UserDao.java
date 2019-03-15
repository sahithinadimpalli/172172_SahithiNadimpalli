package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserDao {

	public boolean register(String email,String psw)  throws SQLException 
	{
		    Connection con =ConnectionFactory.getConnection();
		    String sql =   "insert into users values (?,?)";
			  PreparedStatement pst =   con.prepareStatement(sql);
			  pst.setString(1, email);
			  pst.setString(2, psw);
			 
			  pst.executeUpdate();
			
		return true;
	}
}
