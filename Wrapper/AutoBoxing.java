import java.util.*;
// We store primitive data inside non-primitive class its wrapped inside them.
// AutoBoxing is the automatic conversion of a primitive data type into its 
// corresponding wrapper class object.
// Primitive → Object (Wrapper)

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 10;
		Integer i = a; // This is called Boxing or AutoBoxing.
		System.out.println(a);
		System.out.println(i);
		String s="10";
		System.out.println(Integer.parseInt(s));
		System.out.println(Integer.valueOf(s));

		// Parsing => String to primitive or non primitive.
//		String s = "123Haii"; // will give error
		String s1 = "123";
		int aa  = Integer.parseInt(s1);
		System.out.println(a); // "123" => 123 otherwise it will give error like "123Hai" 
		
		String s2 = "123";
		double d = Double.parseDouble(s2);
		System.out.println(d);
		
		String s3 = "756";
		Integer ii = Integer.valueOf(s3);
		System.out.println(s3);
		
		// Unparsing => primitive or non primitive to string.
		int a1 = 10;
		String str = String.valueOf(a1);
		System.out.println(a1);
		System.out.println(str);
		
		// Converting Wrapper to string type.
		Integer i1 = 101;
		String str1 = Integer.toString(i1);
		System.out.println(str1);
	}
}