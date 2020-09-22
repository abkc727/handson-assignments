package com.hsbc.model.service;

import com.hsbc.model.beans.Account;
import com.hsbc.model.beans.AccountNotFoundException;
import com.hsbc.model.dao.AccountDao;
import com.hsbc.model.utility.AccountFactory;
import com.hsbc.model.utility.Type;

public class AccountServiceImpl implements AccountService{

	private AccountDao dao;
	public AccountServiceImpl() {
		dao = (AccountDao)AccountFactory.getInstance(Type.DAO); 
	}
	@Override
	public Account createAccount(Account account) {
		Account createdAccount = dao.store(account);
		return createdAccount;
	}
	
	@Override
	public Account getAccountById(int accountNumber) throws AccountNotFoundException {
		Account account = dao.fetchAccountById(accountNumber);
		if(account == null) {
			throw new AccountNotFoundException("Sorry account with the id"+accountNumber+"Not found");
		}
		return account;
	}
	
	
	@Override
	public void transfer(int from, int to, double amount)
			throws AccountNotFoundException, InsufficientBalanceException {
		
		Account fromAccount=dao.fetchAccountById(from);
		
		if(fromAccount==null)
			throw new AccountNotFoundException("Sorry, Source Account "+from+" Not found!");
		Account toAccount=dao.fetchAccountById(to);
		if(toAccount==null)
			throw new AccountNotFoundException("Sorry, Destination Account number "+to+" Not found!");
		double currentAmountSource=fromAccount.getBalance();
		if(currentAmountSource<amount)
			throw new InsufficientBalanceException("Balance not sufficient. Balance: "+currentAmountSource);
		currentAmountSource-=amount;
		
		double currentAmountDest=toAccount.getBalance();
		
		currentAmountDest+=amount;
		fromAccount.setBalance(currentAmountSource);
		toAccount.setBalance(currentAmountDest);
		System.out.println("Destination Account updated Balance : "+currentAmountSource);
		System.out.println("Source Account updated Balance : "+currentAmountDest);
		dao.updateAccount(from, fromAccount);
		dao.updateAccount(to,toAccount);
	}
}
