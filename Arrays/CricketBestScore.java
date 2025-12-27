public class CricketBestScore {
    public static void main(String[] args) {
        int[] runs = {45, 67, 23, 89, 34, 78, 56};
        int bestScore = runs[0];
        
        for(int i = 1; i < runs.length; i++) {
            if(runs[i] > bestScore) {
                bestScore = runs[i];
            }
        }
        
        System.out.println("Best Performance (Highest Score): " + bestScore);
    }
}