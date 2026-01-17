public class RemoveBeginEndSpaces {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        int start = 0, end = str.length() - 1;
        
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        
        System.out.println("Original: '" + str + "'");
        System.out.println("Trimmed: '" + result + "'");
    }
}