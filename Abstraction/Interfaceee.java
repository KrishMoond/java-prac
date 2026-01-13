interface A{
    void display();
    int add(int a, int b);
    // A(); // interfaces can have constructors but they cannot be instantiated
}
public class Interfaceee implements A{
    public void display(){
        System.out.println("Hello Interface");
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        Interfaceee obj = new Interfaceee();
        obj.display();
        System.out.println("Sum: " + obj.add(5, 3));
    }
    
}
