class CollegeAttendance {
    public static void main(String[] args) {
        int totalWorkingDays = 30;
        int daysAttended = 27;
        
         double attendancePercentage = (daysAttended * 100.0) / totalWorkingDays;
        
         boolean eligible = daysAttended >= 25;
        
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Days Attended: " + daysAttended);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Exam Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
    }
}