import java.util.*;

@FunctionalInterface
interface InnerLambb {
    int add(int a, int b);
    // void add();
    // void test(int a);
}

public class Lambb {
    public static void main(String args[]){
        InnerLambb l=(a,b)->a+b;
        System.out.println("Sum: "+l.add(10,20));  

        // InnerLambb l=()->{
        //     System.out.println("Hello Lambda Expression");
        // };
        // l.add();

        // InnerLambb l=(a)->{
        //     if(a%2==0)
        //         System.out.println("Even Number");
        //     else
        //         System.out.println("Odd Number");
        // };
        // l.test(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println("Sum of even numbers: " + sum);

        //sorting in descending order
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Sorted list in descending order: " + list);
    }
}