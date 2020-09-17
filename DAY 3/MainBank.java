public class MainBank {
    public static void main(String[] args) {
        long AccountNumber = Long.parseLong(args[0]);
        double depositamount = Double.parseDouble(args[1]);
        Account acc = getAccount(AccountNumber);

        if(acc==null)
        {
            System.out.println("Invalid account number");

        }
        else
        {
            acc.accountInformation();
            acc.deposit(depositamount);
            acc.accountInformation();
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