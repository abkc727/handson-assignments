public class MainBank {
    public static void main(String[] args) {
        long accountNumber1 = Long.parseLong(args[0]);
        long accountNumber2 = Long.parseLong(args[0]);
        double depositamount = Double.parseDouble(args[2]);
        Account withdrawAccount = getAccount(AccountNumber1);
        Account depositamount = Double.parseDouble(args[2]);

        Account withdrawAccount = getAccount(accountNumber1);
        Account destinationAccount = getAccount(accountNumber2);
        if(withdrawAccount == null || destinationAccount == null){
            System.out.println("Invalid");

        }

        else{
            withdrawAccount.accountInformation();
            destinationAccount.accountInformation();
            if(depositamount>withdrawAccount.balance)
            {
                System.out.println("Insufficient");
            }
            else{
                withdrawAccount.accountInformation();
                destinationAccount.accountInformation();
                if(depositamount>withdrawAccount.balance){
                    System.out.println("Not sufficient");
                }
                else{
                    withdrawAccount.withdraw(depositamount);
                    destinationAccount.deposit(depositamount);
                }
                withdrawAccount.accountInformation();
                destinationAccount.accountInformation();
            }
        }

        
        
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();

        

        
        Account account = null;
        // get the account from accounts using the accountNo

        for(int i=0;i<accounts.length;i++)
            {
                if(accounts[i].accountNumber==accountNo)
                    account=accounts[i];
                
            }

        return account;            
    }
}