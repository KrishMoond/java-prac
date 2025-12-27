public class ElectricityUnits {
    public static void main(String[] args) {
        int[] dailyUnits = {25, 30, 28, 35, 22, 40, 33};
        int totalUnits = 0;
        
        for(int i = 0; i < dailyUnits.length; i++) {
            totalUnits += dailyUnits[i];
        }
        
        System.out.println("Total electricity units consumed: " + totalUnits);
    }
}