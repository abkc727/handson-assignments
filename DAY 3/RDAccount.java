class RDAccount extends Account { 
    String[] schedules = {"Monthly", "Quarterly", "Yearly"};

    RDAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    
    }
    void prematureWithdrawl(double amount) {
        System.out.println("prematureWithdrawl() in RD");
    }
    void interestRate() {
        System.out.println("7.5% interest in a year");
    }
    void schedulesList() {
        for(String s : schedules) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

}