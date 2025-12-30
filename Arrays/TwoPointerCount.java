import java.util.*;

public class TwoPointerCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Sort array first for 2-pointer technique
        Arrays.sort(arr);
        
        System.out.println("Occurrence of each element:");
        
        int left = 0;
        while(left < n) {
            int right = left;
            int count = 0;
            
            // Move right pointer to count same elements
            while(right < n && arr[right] == arr[left]) {
                count++;
                right++;
            }
            
            System.out.println(arr[left] + " occurs " + count + " times");
            left = right; // Move left pointer to next different element
        }
        
        sc.close();
    }
}