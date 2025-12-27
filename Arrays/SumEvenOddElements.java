public class SumEvenOddElements {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 21, 24, 27, 30};
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        
        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
    }
}