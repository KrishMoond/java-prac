public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed = reversed + words[i].charAt(j);
            }
            result = result + reversed + " ";
        }
        
        System.out.println("Original: " + str);
        System.out.println("Result: " + result.trim());
    }
}