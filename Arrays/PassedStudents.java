public class PassedStudents {
    public static void main(String[] args) {
        int[] marks = {45, 23, 67, 12, 89, 34, 56, 78};
        int passedCount = 0;
        
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] >= 35) {
                passedCount++;
            }
        }
        
        System.out.println("Number of students passed: " + passedCount);
    }
}