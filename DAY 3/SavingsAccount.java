class SavingsAccount extends Account { 
    String ifscCode;
    
    SavingsAccount(long accountNumber, double balance, String ifscCode) {
        super(accountNumber, balance);
        this.ifscCode = ifscCode;
      
    }

    void minimumBalance() {
        System.out.println("You must have minimum 5000Rs. balance");
    }
    void withdrawLimit() {
        System.out.println("Withdraw limit in Savings is 50000");
    }


}