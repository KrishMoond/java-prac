class AppointmentConflictException extends Exception {
    AppointmentConflictException(String message) { super(message); }
}

class PendingBillException extends Exception {
    PendingBillException(String message) { super(message); }
}

class UnauthorizedMedicalAccessException extends Exception {
    UnauthorizedMedicalAccessException(String message) { super(message); }
}

class HospitalSystem {
    private String[] bookedSlots = {"10:00", "11:00"};
    private double pendingBill = 5000;
    private String userRole = "nurse";
    
    void bookAppointment(String timeSlot) throws AppointmentConflictException {
        for (String bookedSlot : bookedSlots) {
            if (bookedSlot.equals(timeSlot)) {
                throw new AppointmentConflictException("Time slot " + timeSlot + " already booked");
            }
        }
        System.out.println("Appointment booked for " + timeSlot);
    }
    
    void dischargePatient() throws PendingBillException {
        if (pendingBill > 0) {
            throw new PendingBillException("Cannot discharge patient. Pending bill: " + pendingBill);
        }
        System.out.println("Patient discharged successfully");
    }
    
    void accessMedicalRecords() throws UnauthorizedMedicalAccessException {
        if (!userRole.equals("doctor")) {
            throw new UnauthorizedMedicalAccessException("Access denied. Only doctors can access medical records");
        }
        System.out.println("Medical records accessed");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        HospitalSystem hospital = new HospitalSystem();
        
        try {
            hospital.bookAppointment("10:00"); // Conflicting appointment
        } catch (AppointmentConflictException e) {
            System.out.println("Appointment failed: " + e.getMessage());
        }
        
        try {
            hospital.dischargePatient(); // Pending bill
        } catch (PendingBillException e) {
            System.out.println("Discharge failed: " + e.getMessage());
        }
        
        try {
            hospital.accessMedicalRecords(); // Unauthorized access
        } catch (UnauthorizedMedicalAccessException e) {
            System.out.println("Access failed: " + e.getMessage());
        }
    }
}