public class RemoveAdjacentPairs {
    public static void main(String[] args) {
        String str = "aabbcc";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                result = result + str.charAt(i);
            } else {
                i++; // Skip the next character as it's a pair
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Result: " + result);
    }
}