public class Studd {
    private int id;
    private String name;

    Studd(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return "Studd ID: " + id + ", Name: " + name;
    }

    //comparing content of objects overriding equals() method
    public boolean equals(Object obj){
        if(this == obj) return true; //Reference Check checks memory reference equality
        // If both references point to the same object in memory
        if(obj == null || getClass() != obj.getClass()) return false; //Null & Class Check and Ensures both objects are exactly the same class
        Studd studd = (Studd) obj; //Type Casting child reference inside parent reference
        return id == studd.id && name.equals(studd.name); //Field-by-Field Comparison (Logical Equality)
    }

    //overriding hashCode() method
    @Override
    public int hashCode(){
        int res=Integer.hashCode(id); 
        res=31*res+ name.hashCode();
        return res;
    }
    public static void main(String[] args) {
        Studd s1 = new Studd(101, "Alice");
        Studd s2 = new Studd(101, "Alice");

        System.out.println("Student 1 ID: " + s1.id + ", Name: " + s1.name);
        System.out.println("Student 2 ID: " + s2.id + ", Name: " + s2.name);
        //prinitng object reference
        System.out.println(s1.toString());
        System.out.println(s2);

        System.out.println(s1.equals(s2));
        // System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.getClass().getName());    
    }
}


// there are total 11 non static methods in Object class
// 1. toString()
// 2. equals()
//3. finalize()
//4. getClass()
//5. hashCode()
//6. notify()
//7. notifyAll()
//8. wait()
//9. clone()
//10. wait(long timeout)
//11. wait(long timeout, int nanos)

// when we print object reference it calls toString() method internally
// tostring() mehtods convert object reference into string representation
// purpose of overriding toString() method is to provide meaningful information about object
// we overroide toString() method in our class to return string representation of object with its data members
// default implementation of toString() method in Object class returns class name + "@" + hexadecimal representation of hashcode of object

