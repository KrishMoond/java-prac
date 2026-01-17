import java.util.*;

public class Studd {
     String name;
     int id;

    Studd(String name, int id){
        this.name = name;
        this.id = id;
    }

     public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String args[]){
        // ArrayList<Studd> al = new ArrayList<>();

        // Studd s = new Studd("Krish", 0);
        // al.add(s);

        // fetching values
        // for (Studd st : al) {
        //     System.out.println(st.getName());
        //     System.out.println(st.getId());
        // }

        // Studd sq = al.get(0);
        // System.out.println(sq.name);
        // System.out.println(sq.id);
    }
}
