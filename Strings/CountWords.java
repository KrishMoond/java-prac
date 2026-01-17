public class CountWords {
    public static void main(String[] args) {
        String str = "Hello World Java Programming";
        int count = 1;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Number of words: " + count);
    }
}