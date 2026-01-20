import java.util.*;

class Cus{
     String name;
     int id;

     Cus(String name,int id){
        this.name=name;
          this.id=id;
     }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Name = "+name+", Id = "+id;
    }
}
public class Vec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Vector<Cus> v = new Vector<>();
            v.add(new Cus("A",101));
            v.add(new Cus("B",102));
            v.add(new Cus("C",103));
            v.add(new Cus("D",104));
            v.add(new Cus("E",105));
            
            //print all customers
            for(Cus c : v){
                System.out.println(c);
            }

            //searching customer with id 
    //         System.out.print("Enter customer id to search: ");
    //         int s=sc.nextInt();
    //         for(Cus c : v){
    //             if(c.getId()==s){
    //                 System.out.println("Customer found: "+c);
    //             }
    // }

            //Searching with name
            System.out.print("Enter customer name to search: ");
            String s=sc.next();
            for(Cus c : v){
                if(c.getName().equals(s)){
                    System.out.println("Customer found: "+c);
                }
            }
            //delete customer with id
            System.out.print("Enter customer id to delete: ");
            int d=sc.nextInt();
            for(Cus c : v){
                if(c.getId()==d){
                    v.remove(c);
                    System.out.println("Customer deleted: "+c);
                    break;
                }
            }

            //print all customers after deletion
            System.out.println("Customers after deletion:");
            for(Cus c : v){
                System.out.println(c);
            }
    }
}
