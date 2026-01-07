public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
        c.childMethod();
    }
}

class Parent {
    void parentMethod() {
        System.out.println("Parent: parentMethod()");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child: childMethod()");
    }
}
