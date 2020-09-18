public class Main {
    public static void main(String[] args) {
        Address[] a = new Address[4];
        Account[] b = new Account[4];


        a[0]=new Address("Kerala","Calicut",673601);
        a[1]=new Address("Tamil Nadu","Vellore",123101);
        a[2]=new Address("Goa","Panaji",989878);
        a[3]=new Address("Maharashtra","Pune",660321);

        b[0]=new Account(11111L, 50000D);
        b[1]=new Account(22222L, 60000D);
        b[2]=new Account(33333L, 70000D);
        b[3]=new Account(44444L, 80000D);

        customer c1 = new customer("Aditya","22/09/2010","Male",99446677L,a[0],b[0],75000D);
        student s1 = new student("Anzil","11/03/1990","Male",61446878L,a[1],b[1],"A");
        programmer p1 = new programmer("Akshay","01/11/2000","Male",81448931L,a[2],b[2],60000D);
        manager m1 = new manager("Haritha","06/04/1999","Female",63786600L,a[3],b[3],65000D);

        Display(s1);
        Display(c1);
        Display(p1);
        Display(m1);
        

        updateA(s1);
        updateA(c1);
        updateA(p1);
        updateA(m1);

        Display(s1);
        Display(c1);
        Display(p1);
        Display(m1);
        
 

        
    }

    public static void Display(Admin admin)
    {
        admin.getinformation();
    }
    

    public static void updateA(Admin admin)
    {
        admin.update(admin);
    }

    
}