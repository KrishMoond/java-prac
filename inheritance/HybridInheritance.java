public class HybridInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.parentMethod(); // from A
        d.b();            // from I (implemented in C)
        d.c();            // from C
    }
}

class A {
    void parentMethod() {
        System.out.println("A.parentMethod()");
    }
}

interface I {
    void b();
}

class C extends A implements I {
    public void b() { System.out.println("I.b() implemented in C"); }
    void c() { System.out.println("C.c()"); }
}

class D extends C {
    // D inherits parentMethod(), b() and c()
}
