import java.util.*;
public class ArL {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        al.set(1, 100);
        System.out.println(al);

         

        // for(Integer i : al){
        //     System.out.println(i);
        //     // System.out.println(al.indexOf(i));
        // }

        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        // }
        // System.out.println(al.get(0));

        // Iterator it = al.iterator();
        // // System.out.println(it.next());

        // Scanner sc = new Scanner(System.in);

        // while(sc.hasNextInt()){
        //     int n=sc.nextInt();
        //     al.add(n);
        // }
        // // System.out.println(al);

        // ListIterator<Integer> it = al.listIterator(al.size());
        // // traverse backward
        // while (it.hasPrevious()) {
        //     System.out.println(it.previous());
        // }
        // // traverse forward
        // // while (it.hasNext()) {

        // //     System.out.println(it.next());
        // // }

        // while (true) {
        //     System.out.println("hasNext = " + it.hasNext());

        //      if (!it.hasNext()) {
        //         break;
        //     }

        //      System.out.println(it.next());
        //     }
    }
}
