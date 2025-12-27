public class MaxSecondHalf {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15, 40, 8, 35};
        int mid = arr.length / 2;
        int max = arr[mid];
        
        System.out.print("Second half elements: ");
        for(int i = mid; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("\\nMaximum of second half elements: " + max);
    }
}