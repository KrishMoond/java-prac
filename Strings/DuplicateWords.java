public class DuplicateWords {
    public static void main(String[] args) {
        String str = "java is great java is fun";
        String[] words = str.split(" ");
        
        System.out.println("Duplicate words:");
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            
            if (count > 1) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (words[k].equals(words[i])) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(words[i] + " - " + count + " times");
                }
            }
        }
    }
}