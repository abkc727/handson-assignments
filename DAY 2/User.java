class User {
    public static void main(String[] args) {
        Savings s1 = new Savings(123456789L,"Aditya","Kerala","Calicut");
        Savings s2 = new Savings(654421780L,"Akshay",3512345.21D,"Tamil Nadu","Vellore");
        Savings s3 = new Savings(343437651L,"Hari", 43123211.1D, "Maharashta","Pune", "ASC123");
        Savings s4 = new Savings(907234112L,"Chandni","Kerala");
        Savings s5 = new Savings(654444549L,"Akash",3434512.21D,"Telangana");

        s1.display();
        s2.display();
        s2.withdraw(1000);
        s2.display();
        s3.display();
        s3.deposit(10000);
        s3.display();
        s4.display();
        s4.withdraw(200.32);
        s4.display();
        s5.display();
        s5.deposit(30000.50);
        s5.display();
    }
}