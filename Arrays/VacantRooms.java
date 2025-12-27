// import java.util.Arrays;

// public class VacantRooms {
//     public static void main(String[] args) {
//         int[] rooms = {101, 0, 103, 0, 105, 106, 0, 108};

//         System.out.print("Original room allocation: ");
//         for (int r : rooms) {
//             System.out.print(r + " ");
//         }

//         int slow = 0;

//         for (int fast = 0; fast < rooms.length; fast++) {
//             if (rooms[fast] != 0) {
//                 rooms[slow++] = rooms[fast];
//             }
//         }

//         System.out.print("\nAfter moving vacant rooms to end: ");
//         for (int r : rooms) {
//             System.out.print(r + " ");
//         }
//     }
// }


import java.util.Arrays;

public class VacantRooms {
    public static void main(String[] args) {
        int[] rooms = {101, 0, 103, 0, 105, 106, 0, 108};

        System.out.print("Original room allocation: ");
        for (int r : rooms) {
            System.out.print(r + " ");
        }

        int slow = 0;

         for (int fast = 0; fast < rooms.length; fast++) {
            if (rooms[fast] != 0) {
                rooms[slow++] = rooms[fast];
            }
        }

         for (int i = slow; i < rooms.length; i++) {
            rooms[i] = 0;
        }

        System.out.print("\nAfter moving vacant rooms to end: ");
        for (int r : rooms) {
            System.out.print(r + " ");
        }
    }
}
