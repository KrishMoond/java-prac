public class StudentGrade {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 88, 95};
        int sum = 0;
        
        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        
        double average = (double)sum / marks.length;
        String grade;
        
        if(average >= 90) grade = "A";
        else if(average >= 80) grade = "B";
        else if(average >= 70) grade = "C";
        else if(average >= 60) grade = "D";
        else grade = "F";
        
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}