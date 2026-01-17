public class LargestSmallestWord {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String[] words = str.split(" ");
        String largest = words[0];
        String smallest = words[0];
        
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Largest word: " + largest);
        System.out.println("Smallest word: " + smallest);
    }
}