public class MergeStringArrays {
    public static void main(String[] args) {
        String[] arr1 = {"Hello", "World"};
        String[] arr2 = {"Java", "Programming"};
        String[] merged = new String[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        
        System.out.println("Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }
}