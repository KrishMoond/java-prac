public class AverageFirstHalf {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15, 40, 8, 35};
        int mid = arr.length / 2;
        int sum = 0;
        
        System.out.print("First half elements: ");
        for(int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        
        double average = (double)sum / mid;
        System.out.println("\\nAverage of first half elements: " + average);
    }
}