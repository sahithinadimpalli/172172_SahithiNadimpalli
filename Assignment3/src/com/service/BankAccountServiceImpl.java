package com.service;

import java.sql.SQLException;

import com.dao.*;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountepositoryImpl repository;

	@Override
	public double withdraw(long accountId, double balance) throws SQLException {
		double availableBalance=repository.getBalance(accountId);
		if(availableBalance>=balance) {
			return repository.updateBalance(accountId, availableBalance-balance);
		}
		else {
			return -1;
		}
		
	}

	public void setRepository(BankAccountepositoryImpl repository) {
		this.repository = repository;
	}

	@Override
	public double deposit(long accountId, double balance) throws SQLException {
		double availableBalance=repository.getBalance(accountId);
		
		return repository.updateBalance(accountId, availableBalance+balance);
	}

	@Override
	public double getBalance(long accountId) throws SQLException {
		return repository.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws SQLException {
		double availableBalance=repository.getBalance(fromAccount);
		if(availableBalance>=amount) {
			double availableBalanceInToAccount=repository.getBalance(toAccount);
			repository.updateBalance(toAccount,availableBalanceInToAccount+amount);
			repository.updateBalance(fromAccount,availableBalance-amount);
			return true;
			
			
			
		}
		
		return false;
	}
	

}
