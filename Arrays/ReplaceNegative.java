import java.util.Arrays;

public class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -15, 30, -25};

         for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

         int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }

        System.out.println(Arrays.toString(arr));
    }
} 
