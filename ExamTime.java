class ExamTime {
    public static void main(String[] args) {
        boolean isPhysicallyChallenged = true;
        double attendance = 65.0;
        boolean approvedByAdmin = true;
        int examDuration = 120; 
        
         boolean eligibleForExtraTime = isPhysicallyChallenged || (attendance < 75 && approvedByAdmin);
        
         int extraTime = eligibleForExtraTime ? 30 : 0;
        
         examDuration += extraTime;
        
        System.out.println("Physically Challenged: " + isPhysicallyChallenged);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Admin Approved: " + approvedByAdmin);
        System.out.println("Extra Time: " + extraTime + " minutes");
        System.out.println("Total Exam Duration: " + examDuration + " minutes");
    }
}