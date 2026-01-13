class PatientNotFoundException extends Exception {
    PatientNotFoundException(String message) { super(message); }
}

class DatabaseConnectionException extends Exception {
    DatabaseConnectionException(String message) { super(message); }
}

class PatientRecord {
    private String patientId;
    private String name;
    
    PatientRecord(String patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }
    
    String getPatientId() { return patientId; }
    String getName() { return name; }
}

class MedicalSystem {
    private PatientRecord[] patients = {
        new PatientRecord("P001", "John Doe"),
        new PatientRecord("P002", "Jane Smith")
    };
    private boolean dbConnected = true;
    
    PatientRecord accessPatientRecord(String patientId) throws PatientNotFoundException, DatabaseConnectionException {
        if (!dbConnected) {
            throw new DatabaseConnectionException("Database connection failed");
        }
        
        for (PatientRecord patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                System.out.println("Accessing record for: " + patient.getName());
                return patient;
            }
        }
        
        throw new PatientNotFoundException("Patient ID " + patientId + " not found");
    }
    
    void setDbConnection(boolean status) { this.dbConnected = status; }
}

public class DoctorPatientSystem {
    public static void main(String[] args) {
        MedicalSystem system = new MedicalSystem();
        
        try {
            system.accessPatientRecord("P003"); // Non-existent patient
        } catch (PatientNotFoundException | DatabaseConnectionException e) {
            System.out.println("Access failed: " + e.getMessage());
        }
    }
}