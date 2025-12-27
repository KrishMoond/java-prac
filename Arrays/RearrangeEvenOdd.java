public class RearrangeEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = new int[arr.length];
        int pos = 0;
        
        // Add even numbers first
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                result[pos] = arr[i];
                pos++;
            }
        }
        
        // Add odd numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                result[pos] = arr[i];
                pos++;
            }
        }
        
        System.out.print("Rearranged array (even first): ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}