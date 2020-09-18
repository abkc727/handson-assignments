public class student extends Admin {
    String grade;
     public student(String name, String dob, String gender, long phoneno, Address address, Account account, String grade) {
        super(name, dob, gender, phoneno, address, account);
        this.grade=grade;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public void update(Admin admin) {
        System.out.println("Updating Student Grade!");
        if(getGrade()=="A")
            this.grade="B";
        else
            System.out.println("No changes made, because it is not A");    
    }        


    

    @Override
    public void getinformation()
    {
        super.getinformation();
        System.out.println("Grade: "+this.grade);
    }
}