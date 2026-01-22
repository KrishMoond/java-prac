public class Meth {

    public static int add(int x, int y){
        return x + y; //this must be last in the body  and is mandatory is return type is not void
        // after this any statement will be unreachable
        
    
    }
    
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int sum = add('a', 'b'); // implicit type casting char to int
        System.out.println("Sum: " + sum);

        class c{
            void display(){
                System.out.println("Inner class method called");
            }
        }
        c obj = new c();
        obj.display();
         
    }
}

// the bind between the method call and method body is done at compile time is known as static binding or early binding
// method overloading is an example of static binding
// if exact data type is not found then compiler will look for possible type conversion and select the best match