public class MinEvenIndexElements {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15, 40, 8, 35};
        int min = arr[0]; // Start with first even index element
        
        System.out.print("Even indexed elements: ");
        for(int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("\\nMinimum of even indexed elements: " + min);
    }
}