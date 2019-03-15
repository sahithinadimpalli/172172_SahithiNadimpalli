package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankAccountepositoryImpl implements BankAccountRepository {
	private static Connection conn;

	@Override
	public double getBalance(long accountId) {
		String query="select accountbalance from bankaccount where accountid=?";
		double balance=-1;
		try {
			conn=getConnection();
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setLong(1,accountId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				balance=rs.getLong("accountbalance");
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return balance;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		String query="update bankaccount set accountbalance=? where accountid=?";
		int updatedRows=-1;
		double balance=-1;
		try {
			conn=getConnection();
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setDouble(1,newBalance);
			ps.setLong(2,accountId);
			updatedRows=ps.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		if(updatedRows==1) {
			return newBalance;
			
		}
		else {
			return -1;
		}
	}
	
	public Connection getConnection()throws Exception {
		
	
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
		
		 return conn;
		
	}
	
	

}
