public class Poly extends PolyExample {
     void demo(){
        System.out.println("Poly demo method");
    }

    void dis(){
        demo();
        super.demo();
    }

    int a=10;
    public static void main(String[] args) {
        Poly p = new Poly();
        p.dis();
        System.out.println("Value of a: " + p.a);
    }
}

class PolyExample{
    void demo(){
        System.out.println("PolyExample demo method");
    }
}