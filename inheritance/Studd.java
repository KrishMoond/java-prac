public class Studd extends Person {
    int id;
    Studd(String name, int id){
        super(name);
        this.id=id;

    }
    public static void main(String args[]){
        Studd obj= new Studd("Krish",12);
        System.out.println(obj.id);
        System.out.println(obj.name);

    }
}

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

//variable shadowing ariable shadowing happens when a variable declared 
// in a smaller scope (like a method or block) has the same name as a variable
//  in a larger scope (like a class or instance variable).
// In such cases, the inner variable hides (shadows) the outer one.