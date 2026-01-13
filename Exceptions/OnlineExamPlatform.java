class MultipleLoginDetectedException extends Exception {
    MultipleLoginDetectedException(String message) { super(message); }
}

class ExamTimeExpiredException extends Exception {
    ExamTimeExpiredException(String message) { super(message); }
}

class SecurityViolationException extends Exception {
    SecurityViolationException(String message) { super(message); }
}

class OnlineExamPlatform {
    private boolean alreadyLoggedIn = true;
    private int examDuration = 120; // minutes
    private int tabSwitchCount = 0;
    private int maxTabSwitches = 3;
    
    void startExam(String studentId, int timeElapsed) throws MultipleLoginDetectedException, ExamTimeExpiredException {
        if (alreadyLoggedIn) {
            throw new MultipleLoginDetectedException("Student " + studentId + " already logged in from another device");
        }
        
        if (timeElapsed >= examDuration) {
            throw new ExamTimeExpiredException("Exam auto-submitted after " + examDuration + " minutes");
        }
        
        System.out.println("Exam started for student: " + studentId);
    }
    
    void detectTabSwitch() throws SecurityViolationException {
        tabSwitchCount++;
        if (tabSwitchCount > maxTabSwitches) {
            throw new SecurityViolationException("Security violation: Tab switching limit exceeded (" + tabSwitchCount + "/" + maxTabSwitches + ")");
        }
        System.out.println("Tab switch detected: " + tabSwitchCount);
    }
}

public class OnlineExamPlatform {
    public static void main(String[] args) {
        OnlineExamPlatform platform = new OnlineExamPlatform();
        
        try {
            platform.startExam("STU001", 100);
        } catch (MultipleLoginDetectedException | ExamTimeExpiredException e) {
            System.out.println("Exam start failed: " + e.getMessage());
        }
        
        try {
            for (int i = 0; i < 5; i++) {
                platform.detectTabSwitch(); // Will exceed limit
            }
        } catch (SecurityViolationException e) {
            System.out.println("Security issue: " + e.getMessage());
        }
    }
}