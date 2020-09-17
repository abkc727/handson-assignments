public class MainBank {
    public static void main(String[] args) {

	System.out.println("------2nd Requirement--------");
	long sourceAccNo = Long.parseLong(args[0]);
	long destAccNo = Long.parseLong(args[1]);
	double amount = Double.parseDouble(args[2]);

	Account sourceAccount = getAccount(sourceAccNo);
	Account destAccount = getAccount(destAccNo);

	if(!accountCheck(sourceAccount) && !accountCheck(destAccount)){

	System.out.println("------------------------------------------");
	System.out.println("enter correct account details");
	System.out.println("------------------------------------------");
	return ;


	}

	System.out.println("------------------------------------------");

	System.out.println("------Source account details-----");
	sourceAccount.accountInformation();
	System.out.println("-----Destination account details------");
	destAccount.accountInformation();

	System.out.println("------------------------------------------");
	System.out.println("------Transferring Cash from source to dest-----");
	sourceAccount.withdraw(amount);
	destAccount.deposit(amount);

	System.out.println("------------------------------------------");

	System.out.println("------Source account details-----");
	sourceAccount.accountInformation();
	System.out.println("-----Destination account details------");
	destAccount.accountInformation();
	System.out.println("------------------------------------------");


	
    }

 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();



        // get the account from accounts using the accountNo
	for(Account account : accounts){

		if(account.getAccountNumber() == accountNo)
			return account;

	}

	return null;
    }


    public static Boolean accountCheck(Account account) {

	if(account == null){
		
		System.out.println("------------------------------------------");
		System.out.println("Sorry Account not found");
		System.out.println("------------------------------------------");

		return false;

	}
	return true;



}
}