package com.hsbc.controller;

import java.util.Scanner;
import com.hsbc.model.beans.AccountNotFoundException;
import com.hsbc.model.beans.InsufficientBalanceException;
import com.hsbc.model.dao.AccountDao;
import com.hsbc.model.service.AccountService;
import com.hsbc.model.utility.AccountFactory;
import com.hsbc.model.beans.Account;
import com.hsbc.model.utility.Type;


public class MainViewController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AccountService service = (AccountService)AccountFactory.getInstance(Type.SERVICE);
		AccountDao dao = (AccountDao)AccountFactory.getInstance(Type.DAO); 
		int option = 0;
		
		do {
			System.out.println("------------");
			System.out.println("1. Store Account 2. Fetch All 3. Fetch Account by Id 4. Transfer Amount 5. Exit");
			
			option = scanner.nextInt();
			switch(option) { 
			case 1:
				Account account = new Account();
				System.out.println("Enter Customer name");
				account.setCustomerName(scanner.next());
				
				System.out.println("Balance: ");
				account.setBalance(scanner.nextDouble());
				
				System.out.println("Number: ");
				account.setContactNumber(scanner.nextLong());
				
				Account createdAccount = service.createAccount(account);
				System.out.println("Account creted with acc no: "+createdAccount.getAccountNumber());
				break;
				
			case 2:
				Account[] accounts = dao.fetchAccounts();
				for(Account temp : accounts) {
					if(temp!=null)
					System.out.println(temp);
				}
				break;
				
			case 3:
				System.out.println("Enter the account : ");
				int accountSearch=scanner.nextInt();
				try {
					Account accountSearchId=service.getAccountById(accountSearch);
					System.out.println(accountSearchId);
				}catch(AccountNotFoundException e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 4:
				try {
				System.out.println("Enter the Source Account Number : ");
				int sourceAccount=scanner.nextInt();
				System.out.println("Enter the Destination Account Number : ");
				int DestinationAccount=scanner.nextInt();
				System.out.println("Enter the amount to transfer : ");
				
				double amount=scanner.nextDouble();
				service.transfer(sourceAccount, DestinationAccount,amount);
				}catch(AccountNotFoundException e) {
					System.err.println(e.getMessage());
				}catch(InsufficientBalanceException e) {
					System.err.println(e.getMessage());
				}
			}
		}while(option!=5);
	scanner.close();
				
				
	
	}

}
