class Parent {
    String name;
    int age;
    
    // Non-static method
    void displayParent() {
        System.out.println("Parent Name: " + name);
        System.out.println("Parent Age: " + age);
    }
    
    // Non-static method
    void work() {
        System.out.println("Parent is working");
    }
    
}

class Child extends Parent {
    String school;
    int grade;
    
    // Non-static method
    void displayChild() {
        System.out.println("Child Name: " + name);
        System.out.println("Child Age: " + age);
        System.out.println("School: " + school);
        System.out.println("Grade: " + grade);
    }
    
    // Overriding parent's non-static method
    void work() {
        System.out.println("Child is studying");
    }
    
    // Child's own non-static method
    void play() {
        System.out.println("Child is playing");
    }
    
    // Main method in Child class
    public static void main(String[] args) {
        System.out.println("Main method from CHILD class executed!");
        Child c = new Child();
        c.name = "Child Main";
        c.school = "XYZ School";
        c.displayChild();
    }
}

public class NonStaticInheritance {
    public static void main(String[] args) {
        // Create parent object
        Parent parent = new Parent();
        parent.name = "John";
        parent.age = 45;
        
        System.out.println("Parent Object");
        parent.displayParent();
        parent.work();
        
        // Create child object
        Child child = new Child();
        child.name = "Alice";
        child.age = 12;
        child.school = "ABC School";
        child.grade = 7;
        
        System.out.println("\n Child Object");
        child.displayChild();
        child.work(); // Calls overridden method
        child.play();
        
        // Polymorphism with non-static methods
        System.out.println("\nPolymorphism");
        Parent p = new Child();
        p.name = "Bob";
        p.age = 10;
        p.displayParent(); // Calls parent method
        p.work(); // Calls child's overridden method
    }
}