public class NumberToWords {
    public static void main(String[] args) {
        int num = 123;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(num);
        String result = "";
        
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result = result + words[digit] + " ";
        }
        
        System.out.println("Number: " + num);
        System.out.println("Words: " + result.trim());
    }
}