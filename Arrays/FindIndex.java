public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        
        if(index != -1) {
            System.out.println("Index of " + target + ": " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}