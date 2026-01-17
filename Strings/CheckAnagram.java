public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }
        
        boolean isAnagram = true;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int count1 = 0, count2 = 0;
            
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) count1++;
                if (str2.charAt(j) == ch) count2++;
            }
            
            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }
        
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}