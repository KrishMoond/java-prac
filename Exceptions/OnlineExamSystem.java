class InternetDisconnectionException extends Exception {
    InternetDisconnectionException(String message) { super(message); }
}

class SessionTimeoutException extends Exception {
    SessionTimeoutException(String message) { super(message); }
}

class FileUploadFailureException extends Exception {
    FileUploadFailureException(String message) { super(message); }
}

class ExamSystem {
    private boolean internetConnected = true;
    private int sessionTime = 30; // minutes
    private boolean fileCorrupted = false;
    
    void submitExam(String examFile, int timeElapsed) throws InternetDisconnectionException, SessionTimeoutException, FileUploadFailureException {
        if (!internetConnected) {
            throw new InternetDisconnectionException("Internet connection lost during submission");
        }
        if (timeElapsed > sessionTime) {
            throw new SessionTimeoutException("Session expired after " + sessionTime + " minutes");
        }
        if (fileCorrupted) {
            throw new FileUploadFailureException("File upload failed - corrupted file");
        }
        
        System.out.println("Exam submitted successfully: " + examFile);
    }
    
    void setInternetStatus(boolean status) { this.internetConnected = status; }
    void setFileStatus(boolean corrupted) { this.fileCorrupted = corrupted; }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        ExamSystem exam = new ExamSystem();
        
        try {
            exam.setInternetStatus(false); // Simulate internet issue
            exam.submitExam("MathExam.pdf", 25);
        } catch (InternetDisconnectionException | SessionTimeoutException | FileUploadFailureException e) {
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}