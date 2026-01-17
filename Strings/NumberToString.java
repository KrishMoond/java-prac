public class NumberToString {
    public static void main(String[] args) {
        int num = 12345;
        String str = String.valueOf(num);
        
        System.out.println("Number: " + num);
        System.out.println("String: " + str);
        System.out.println("Type: " + str.getClass().getSimpleName());
    }
}