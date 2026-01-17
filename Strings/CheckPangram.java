public class CheckPangram {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        boolean isPangram = true;
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch || str.charAt(i) == (char)(ch - 32)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isPangram = false;
                break;
            }
        }
        
        if (isPangram) {
            System.out.println("String is a pangram");
        } else {
            System.out.println("String is not a pangram");
        }
    }
}