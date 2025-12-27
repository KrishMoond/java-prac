public class MergeBusSeats {
    public static void main(String[] args) {
        int[] bus1Seats = {1, 3, 5, 7, 9};
        int[] bus2Seats = {2, 4, 6, 8, 10};
        int[] mergedSeats = new int[bus1Seats.length + bus2Seats.length];
        
        // Copy bus1 seats
        for(int i = 0; i < bus1Seats.length; i++) {
            mergedSeats[i] = bus1Seats[i];
        }
        
        // Copy bus2 seats
        for(int i = 0; i < bus2Seats.length; i++) {
            mergedSeats[bus1Seats.length + i] = bus2Seats[i];
        }
        
        System.out.print("Merged seat numbers: ");
        for(int i = 0; i < mergedSeats.length; i++) {
            System.out.print(mergedSeats[i] + " ");
        }
    }
}