package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String email,String psw){  
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from users where email=? and psw=?");  
		ps.setString(1,email);  
		ps.setString(2,psw);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
		}  
