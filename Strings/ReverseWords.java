public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        String result = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i] + " ";
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed words: " + result.trim());
    }
}