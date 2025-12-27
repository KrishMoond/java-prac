public class MaxOddIndexElements {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15, 40, 8, 35};
        int max = arr[1]; // Start with first odd index element
        
        System.out.print("Odd indexed elements: ");
        for(int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("\\nMaximum of odd indexed elements: " + max);
    }
}