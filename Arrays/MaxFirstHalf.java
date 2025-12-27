public class MaxFirstHalf {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15, 40, 8, 35};
        int mid = arr.length / 2;
        int max = arr[0];
        
        System.out.print("First half elements: ");
        for(int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("\\nMaximum of first half elements: " + max);
    }
}