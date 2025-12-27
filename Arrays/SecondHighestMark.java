public class SecondHighestMark {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 88, 95, 82};
        int highest = marks[0];
        int secondHighest = marks[0];
        
        // Find highest
        for(int i = 1; i < marks.length; i++) {
            if(marks[i] > highest) {
                highest = marks[i];
            }
        }
        
        // Find second highest
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] > secondHighest && marks[i] < highest) {
                secondHighest = marks[i];
            }
        }
        
        System.out.println("Second highest mark: " + secondHighest);
    }
}