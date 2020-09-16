class Employee {
    int id;
    String name;
    double salary;

    Address address;
    Employee(int id, String name, double salary, Address address ){
        this(id,name,salary);
        this.address=address;
    }

    Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    void display() {

        System.out.println("Id = "+id+" , Name = "+name+" Salary = "+salary);
        System.out.println("State: "+address.state+" , City: "+address.city+" pin: "+address.pin);
    }
}