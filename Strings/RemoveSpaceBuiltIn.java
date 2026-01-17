public class RemoveSpaceBuiltIn {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String result = str.replace(" ", "");
        
        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }
}