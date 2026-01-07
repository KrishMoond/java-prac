class Person{
    String name;
    String address;
    Person(String name,String address){
        this.name=name;
        this.address=address;
    }

}

class Employee extends Person{
    int empId;
    String companyName;
    Employee(String name,String address,int empId,String companyName){
        super(name,address);
        this.empId=empId;
        this.companyName=companyName;
    }
}

// we do upcasting for generalization 
public class Supp {
    public static void main(String[] args) {
        // Employee emp=new Employee("Johnn"," Main St",101,"TechCorp");
        // System.out.println("Employee Name: "+emp.name);
        // System.out.println("Employee Address: "+emp.address);
        // System.out.println("Employee ID: "+emp.empId);
        // System.out.println("Company Name: "+emp.companyName);

        Person p= new Employee("Alice","2nd St",102,"BizInc"); // upcasting
        System.out.println("Person Name: "+p.name);
        System.out.println("Person Address: "+p.address);
        // System.out.println("Employee ID: "+p.empId); // error
        // we cannot access empId and companyName using p reference as we have upcasted it to Person


        //downcasting
        Employee e=(Employee)p; // downcasting
        System.out.println("Employee ID: "+e.empId);
        System.out.println("Company Name: "+e.companyName);
     }
}


