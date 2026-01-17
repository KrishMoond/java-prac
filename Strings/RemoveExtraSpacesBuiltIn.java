public class RemoveExtraSpacesBuiltIn {
    public static void main(String[] args) {
        String str = "  Hello   World   Java  ";
        String result = str.trim().replaceAll("\\s+", " ");
        
        System.out.println("Original: '" + str + "'");
        System.out.println("Result: '" + result + "'");
    }
}