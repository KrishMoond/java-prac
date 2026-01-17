public class CapitalizeFirstLetterNoSplit {
    public static void main(String[] args) {
        String str = "hello world java";
        String result = "";
        boolean capitalizeNext = true;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                result = result + ch;
                capitalizeNext = true;
            } else {
                if (capitalizeNext && ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32);
                    capitalizeNext = false;
                }
                result = result + ch;
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Result: " + result);
    }
}