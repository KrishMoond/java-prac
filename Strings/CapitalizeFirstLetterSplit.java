public class CapitalizeFirstLetterSplit {
    public static void main(String[] args) {
        String str = "hello world java";
        String[] words = str.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                char first = word.charAt(0);
                if (first >= 'a' && first <= 'z') {
                    first = (char)(first - 32);
                }
                result = result + first + word.substring(1) + " ";
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Result: " + result.trim());
    }
}