public class manager extends Admin {

    double salary, newbalance=0000000;

    Account acc;


     public manager(String name, String dob, String gender, long phoneno, Address address, Account account, double salary) {
        super(name, dob, gender, phoneno, address, account);
        this.salary=salary;
    }

    public double getSalary() {
        return this.salary;
    }

 

    @Override
    public void update(Admin admin) {
        System.out.println("Updating Salary!");
        this.salary=getSalary()+getSalary()*0.1;

        System.out.println("Updating balance,!");
       
        acc.setbalance(0);
      

        
    }        


    @Override
    public void getinformation()
    {
        super.getinformation();
        System.out.println("Salary: "+this.salary);
    }

}