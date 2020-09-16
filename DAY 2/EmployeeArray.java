class EmployeeArray {
    public static void main(String[] args){
        Employee[] e = new Employee[5];
        Address[] a = new Address[5];
        a[0]=new Address("Kerala","Calicut",673601);
        a[1]=new Address("Tamil Nadu","Vellore",123101);
        a[2]=new Address("Goa","Panaji",989878);
        a[3]=new Address("Maharashtra","Pune",660321);
        a[4]=new Address("Telangana","Hyderabad",560211);

        
        e[0] = new Employee(1,"Aditya",123400.5D, a[0]);
        e[1] = new Employee(2,"Chandni",45000.21D,a[1]);
        e[2] = new Employee(3,"Pallavi",35000.55D,a[2]);
        e[3] = new Employee(4,"Akshay",77001.300D,a[3]);
        e[4] = new Employee(5,"Akash",676788.21D,a[4]);

        for(Employee x: e)
        {
            if(x.salary>50000)
                x.display();
        }




    }
}