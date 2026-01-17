public class RemoveCharsFromSecond {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "lo";
        String result = "";
        
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                result = result + ch;
            }
        }
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Result: " + result);
    }
}