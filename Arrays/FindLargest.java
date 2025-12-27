public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {45, 23, 67, 12, 89, 34};
        int largest = Integer.MIN_VALUE;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
    }
}