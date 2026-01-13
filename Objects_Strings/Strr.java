import java.util.*;
public class Strr {
    public static void main(String[] args) {
        String a="Hello";
        String b="Bye";

        System.out.println(a==b); //compares reference
        System.out.println(a.equals(b)); //compares content
        String s3= new String("Hello");
        System.out.println(a==s3); //compares reference
        System.out.println(a.equals(s3)); //compares content
        //String are immutable in java instead of modifying the existing string object
        //it creates a new string object in the memory

        String s="kvenk";
        String sc="zvenk";
        System.out.println(s.compareTo(sc)); //0 if both strings are equal
         
         char[] ch= {'a','b','c'};
         String schar = new String(ch);
         System.out.println("String from char array: " + schar);
     }
}