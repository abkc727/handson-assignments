public abstract class Admin {
    private String name, dob, gender; //grade;
    private long phoneno;
    //private double salary;

    Address address;
    Account account;

    public Admin(String name, String dob, String gender, long phoneno, Address address, Account account)
    {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.phoneno=phoneno;
        this.address=address;
        this.account=account;
    }

    
    public abstract void update(Admin admin);

    public void getinformation()
    {
        System.out.println("------------------Information------------------");
        System.out.println("Name: "+this.name+", DOB: "+this.dob+", Gender: "+this.gender+", Phone no: "+this.phoneno);
        System.out.println("Address: ");
        System.out.println("State: "+address.state+", City: "+address.city+", Pin: "+address.pin);
        System.out.println("Account: ");
        System.out.println("Account no: "+account.accountNumber+", Balance: "+account.balance);

        
    }


}