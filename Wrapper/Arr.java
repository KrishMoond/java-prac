import java.util.*;
public class Arr {
    public static void main(String args[]){
        ArrayList<Studd> al = new ArrayList<>();

        Studd s = new Studd("Krish", 0);
        Studd s1 = new Studd("klcas", 01);
        Studd s2 = new Studd("Krfwev", 02);
        Studd s3 = new Studd("Krisvsdvdh", 03);
        Studd s4 = new Studd("Krisvdsvh", 04);
        al.add(s);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        // fetching values
        for (Studd st : al) {
            System.out.println(st.getName());
            System.out.println(st.getId());
        }

        for(int i=0;i<al.size();i++){
            if(al.get(i).getName().equals("Krish")){
                System.out.println("ID of "+al.get(i).getName()+" is "+al.get(i).getId());
            }
        }

        System.out.println(al.contains("Krish"));
    }
}
