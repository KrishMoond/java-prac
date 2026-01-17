public class StringToArray {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] arr = str.split(" ");
        
        System.out.println("Original String: " + str);
        System.out.println("String Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}