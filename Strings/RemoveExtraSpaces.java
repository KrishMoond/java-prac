public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello   World   Java  ";
        String result = "";
        boolean spaceFound = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!spaceFound && result.length() > 0) {
                    result = result + ch;
                    spaceFound = true;
                }
            } else {
                result = result + ch;
                spaceFound = false;
            }
        }
        
        if (result.charAt(result.length() - 1) == ' ') {
            result = result.substring(0, result.length() - 1);
        }
        
        System.out.println("Original: '" + str + "'");
        System.out.println("Result: '" + result + "'");
    }
}