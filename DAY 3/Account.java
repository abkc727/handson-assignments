public class Account { 
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }
    public Account() {
        balance = 0.0;
        System.out.println("Account() intialized");
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() { 
        return balance; 
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(double amount) {
        System.out.println("withdraws amount from account");
	if(amount > balance){
		System.out.println("insufficient balance in source");
		System.exit(0);
	}
	balance-=amount;
    }

    public void deposit(double amount) {
        System.out.println("deposits amount to account");
	balance+=amount;
    }
    public void accountInformation() {
        System.out.println("---- Account Information ----");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}