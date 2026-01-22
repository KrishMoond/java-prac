public class TypecastNar {
public static void main(String[] args) {
        // Explicit Typecasting (Narrowing) (larger to smaller)
        double d2 = 123.456;
        float f2 = (float) d2;   
        long l2 = (long) f2;     
        int i2 = (int) l2;       
        short s2 = (short) i2;   
        byte b2 = (byte) s2;     
        
        System.out.println("\nExplicit Typecasting ");
        System.out.println("double: " + d2);
        System.out.println("float: " + f2);
        System.out.println("long: " + l2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);

         
        
    }
}
