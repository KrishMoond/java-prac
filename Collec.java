import java.util.LinkedList;
import java.util.Scanner;

public class Collec {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println("Linked List: " + list);
     }   
}
