import java.util.Scanner;

class SeatUnavailableException extends Exception {
    SeatUnavailableException(String message) {
        super(message);
    }
}

class Flight {
    private String flightNumber;
    private int availableSeats;
    
    Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }
    
    void bookSeats(int requestedSeats) throws SeatUnavailableException {
        if (requestedSeats > availableSeats) {
            throw new SeatUnavailableException("Only " + availableSeats + " seats available, cannot book " + requestedSeats);
        }
        availableSeats -= requestedSeats;
        System.out.println("Booking confirmed! " + requestedSeats + " seats booked on " + flightNumber + ". Remaining seats: " + availableSeats);
    }
}

public class FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flight flight = new Flight("AI101", 3);
        
        System.out.print("Enter number of seats to book: ");
        int seats = sc.nextInt();
        
        try {
            flight.bookSeats(seats);
        } catch (SeatUnavailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
        
        sc.close();
    }
}