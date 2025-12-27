public class PrintEvenElements {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 21, 24, 27, 30};
        
        System.out.println("Even elements:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}