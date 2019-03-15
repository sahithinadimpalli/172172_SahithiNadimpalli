package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountepositoryImpl implements BankAccountRepository {
	@Override
	public double getBalance(long accountId) throws SQLException {
		String query="select accountbalance from bankaccount where accountid=?";
		double balance=-1;
		
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setLong(1,accountId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				balance=rs.getLong("accountbalance");
			}
		return balance;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) throws SQLException {
		String query="update bankaccount set accountbalance=? where accountid=?";
		int updatedRows=-1;
		double balance=-1;
			Connection conn = ConnectionFactory.getConnection();	
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setDouble(1,newBalance);
			ps.setLong(2,accountId);
			updatedRows=ps.executeUpdate();
			
			
	
		
		if(updatedRows==1) {
			return newBalance;
			
		}
		else {
			return -1;
		}
	}
	

}
