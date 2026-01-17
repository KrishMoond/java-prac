public class RemoveOddIndex {
    public static void main(String[] args) {
        String str = "Hello";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Result: " + result);
    }
}