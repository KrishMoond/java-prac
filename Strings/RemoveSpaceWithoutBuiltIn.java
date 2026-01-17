public class RemoveSpaceWithoutBuiltIn {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }
}