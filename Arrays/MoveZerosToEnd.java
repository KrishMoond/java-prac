public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 7};
        int pos = 0;
        
        // Move non-zero elements to front
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        
        // Fill remaining positions with zeros
        while(pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
        
        System.out.print("Array after moving zeros: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}