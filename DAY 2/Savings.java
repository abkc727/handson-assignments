class Savings {
    long accno;
    double balance;
    String name, ifsc, state, city;
   

    Savings(long acn, String nam, String stat, String cit){
        accno = acn;
        name = nam;
        state = stat;
        city = cit;
        ifsc = "HSBC001";
        balance = 0.0;

    }
    Savings(long acn, String nam, double bal, String stat, String cit){
        accno = acn;
        name = nam;
        state = stat;
        city = cit;
        balance = bal;
        ifsc = "HSBC001";
       

    }

    Savings(long acn, String nam, double bal, String stat, String cit, String ifs){
        accno = acn;
        name = nam;
        state = stat;
        city = cit;
        balance = bal;
        ifsc = ifs;
       

    }

    Savings(long acn, String nam, String stat){
        accno = acn;
        name = nam;
        state = stat;
        city = "City not provided";
        balance = 0.0;
        ifsc = "HSBC001";
       

    }

    Savings(long acn, String nam, double bal, String stat){
        accno = acn;
        name = nam;
        state = stat;
        city = "City not provided";
        balance = bal;
        ifsc = "HSBC001";
       

    }

    

    void withdraw(double amnt)
    {   if(balance>=amnt)
            balance= balance-amnt;
        else
            System.out.println("Not sufficient balance to withdraw!");    

    }
    void deposit(double amont)
    {
        balance = balance+amont;
    }



    void display()
    {
        System.out.println("Account no: "+accno);
        System.out.println("IFSC: "+ifsc);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("State: "+state);
        System.out.println("City: "+city);
        System.out.println(".......................................................");
    }
}