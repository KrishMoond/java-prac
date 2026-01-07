public class Mulstat extends B {
    static void demp() {
        System.out.println("Static method in class A executed!");
    }
    public static void main(String[] args) {
        demp(); // Calling static method from class B
    }
    
}

class B{
    static {
        System.out.println("Static block in class B executed!");
    }

    static void demp() {
        System.out.println("Static method in class B executed!");
    }
}
