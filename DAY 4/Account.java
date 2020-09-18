public class Account { 
    long accountNumber;
    double balance;

    Admin admin;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }

    public double getbalance(Admin admin)
    {
        return this.balance;
    }

    public void setbalance(double balance) {
        this.balance=balance;
    }


    

  
}