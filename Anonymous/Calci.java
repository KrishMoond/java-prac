interface Add{
    void add(int a, int b);
}

interface Subtract{
    void subtract(int a, int b);
}

public class Calci {
    public static void main(String args[]){
        Add a= new Add() {
            public void add(int a, int b){
                System.out.println("Addition: "+(a+b));
            }
        };

        Subtract s = new Subtract() {
            public void subtract(int a, int b){
                System.out.println("Subtraction: "+(a-b));
            }
        };

        a.add(10,5);
        s.subtract(10,5);
    }
     
}