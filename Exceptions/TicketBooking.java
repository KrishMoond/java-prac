class SeatNotAvailableException extends Exception {
    SeatNotAvailableException(String message) { super(message); }
}

class BookingFailureException extends Exception {
    BookingFailureException(String message) { super(message); }
}

class TicketBookingSystem {
    private int availableSeats = 5;
    private boolean paymentSuccessful = true;
    private boolean bookingSystemUp = true;
    
    void bookTicket(int requestedSeats) throws SeatNotAvailableException, BookingFailureException {
        if (requestedSeats > availableSeats) {
            throw new SeatNotAvailableException("Only " + availableSeats + " seats available, cannot book " + requestedSeats);
        }
        
        if (paymentSuccessful && !bookingSystemUp) {
            throw new BookingFailureException("Payment succeeded but booking system failed");
        }
        
        availableSeats -= requestedSeats;
        System.out.println("Ticket booked successfully! Seats: " + requestedSeats + ", Remaining: " + availableSeats);
    }
    
    void setBookingSystemStatus(boolean status) { this.bookingSystemUp = status; }
    void setPaymentStatus(boolean status) { this.paymentSuccessful = status; }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketBookingSystem booking = new TicketBookingSystem();
        
        try {
            booking.setBookingSystemStatus(false);
            booking.bookTicket(2);
        } catch (SeatNotAvailableException | BookingFailureException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}