package Abstraction;

abstract class A{
    abstract void display();
    abstract int add(int a, int b);
}
public class ABss extends A{
    void display(){
        System.out.println("Hello Abstract");
    }
    
    int add(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        ABss obj = new ABss();
        obj.display();
        System.out.println("Sum: " + obj.add(5, 3));
    }

}

// when the abstract class is inherited by a subclass,
//overriding of abstract methods is mandatory in the subclass.