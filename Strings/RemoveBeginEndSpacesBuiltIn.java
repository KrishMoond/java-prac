public class RemoveBeginEndSpacesBuiltIn {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        String result = str.trim();
        
        System.out.println("Original: '" + str + "'");
        System.out.println("Trimmed: '" + result + "'");
    }
}