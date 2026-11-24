package constructors;

class Address{
    String city;

    Address(){
        System.out.println(" No Parameter Constructor Address Class ");
    }

    Address(String City){
        this.city = city;
        System.out.println(" Parameterised Constructor Address Class ");
    }
}

class Employee{

    int id;
    String empName;
    Address address;

    Employee(){
        System.out.println(" Constructor with no parameters ");
    }

    Employee(int id){
        this.id = id;
        System.out.println(" Constructor with one parameter ");
    }

    Employee(int id, String empName){
        this.id = id;
        this.empName = empName;
        System.out.println(" Constructor with two parameters ");
    }

    Employee(int id, String empName, Address address){
        this.id = id;
        this.empName = empName;
        this.address= address;
        System.out.println(" Constructors with three parameters ");
    }

    Employee( Employee emp){
        this.id = emp.id;
        this.empName = emp.empName;
        this.address = emp.address;

        System.out.println(" Copy Constructor ");
    }
}

public class ConstructorsDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Kim", new Address("Bangalore"));
        Employee emp2 = new Employee(emp1);

    }
}
