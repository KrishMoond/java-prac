class SeatNotAvailableException extends Exception {
    SeatNotAvailableException(String message) { super(message); }
}

class InvalidPassportException extends Exception {
    InvalidPassportException(String message) { super(message); }
}

class CheckInClosedException extends Exception {
    CheckInClosedException(String message) { super(message); }
}

class AirlineBookingSystem {
    private int availableSeats = 2;
    private int totalSeats = 100;
    
    void bookFlight(int requestedSeats, int passportValidityDays, int minutesBeforeDeparture) throws SeatNotAvailableException, InvalidPassportException, CheckInClosedException {
        if (requestedSeats > availableSeats) {
            throw new SeatNotAvailableException("Overbooking not allowed. Only " + availableSeats + " seats available");
        }
        
        if (passportValidityDays < 180) {
            throw new InvalidPassportException("Passport expires in " + passportValidityDays + " days. Minimum 6 months validity required");
        }
        
        if (minutesBeforeDeparture < 45) {
            throw new CheckInClosedException("Check-in closed. Only " + minutesBeforeDeparture + " minutes before departure");
        }
        
        availableSeats -= requestedSeats;
        System.out.println("Flight booked successfully. Seats: " + requestedSeats);
    }
}

public class AirlineBooking {
    public static void main(String[] args) {
        AirlineBookingSystem airline = new AirlineBookingSystem();
        
        try {
            airline.bookFlight(1, 150, 30); // Passport expires soon
        } catch (SeatNotAvailableException | InvalidPassportException | CheckInClosedException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}