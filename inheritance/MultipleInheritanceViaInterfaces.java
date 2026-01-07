public class MultipleInheritanceViaInterfaces {
    public static void main(String[] args) {
        MultiImpl impl = new MultiImpl();
        impl.a();
        impl.b();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

class MultiImpl implements A, B {
    public void a() { System.out.println("A.a() implemented in MultiImpl"); }
    public void b() { System.out.println("B.b() implemented in MultiImpl"); }
}
