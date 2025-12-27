public class TypeeeCast {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening) 9smaller to larger)
        byte b = 10;
        short s = b;  
        int i = s;    
        long l = i;  
        float f = l;  
        double d = f; 
        
        System.out.println("Implicit Typecasting");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        
        
        
        // String to Primitive
        String str = "100";
        int intFromString = Integer.parseInt(str);
        double doubleFromString = Double.parseDouble("99.99");
        boolean boolFromString = Boolean.parseBoolean("true");
        
        System.out.println("\nString to Primitive ");
        System.out.println("String to int: " + intFromString);
        System.out.println("String to double: " + doubleFromString);
        System.out.println("String to boolean: " + boolFromString);
        
        // Primitive to String
        int num = 50;
        String strFromInt = String.valueOf(num);
        String strFromDouble = String.valueOf(3.14);
        String strFromBoolean = String.valueOf(true);
        
        System.out.println("\n Primitive to String ");
        System.out.println("int to String: " + strFromInt);
        System.out.println("double to String: " + strFromDouble);
        System.out.println("boolean to String: " + strFromBoolean);
        
        // Character to ASCII and vice versa
        char ch = 'A';
        int ascii = (int) ch;   
        char charFromAscii = (char) 66;  
        
        System.out.println("\n Character Conversion ");
        System.out.println("char 'A' to ASCII: " + ascii);
        System.out.println("ASCII 66 to char: " + charFromAscii);
    }
}


// decimal container have higher capacity than other data types