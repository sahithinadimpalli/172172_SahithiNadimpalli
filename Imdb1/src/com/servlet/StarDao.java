package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StarDao {

	public boolean register(String name,String star) throws SQLException {
	    Connection con =ConnectionFactory.getConnection();
	    String sql =   "insert into starrating values (?,?)";
	    String sqlstar="select avg(star) from starrating";
		  PreparedStatement ps1 =   con.prepareStatement(sql);
		  PreparedStatement ps2= con.prepareStatement(sqlstar);
		  
		  ps1.setString(1, name);
		  ps1.setString(2, star);
		 
		  ps1.executeUpdate();
		
	return true;
}
}
