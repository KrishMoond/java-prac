class InsurancePremium {
    public static void main(String[] args) {
        int age = 30;
        boolean isSmoker = false;
        boolean isDrinker = false;
        int healthScore = 9;
        
        boolean eligible = (age >= 25) && !isSmoker && !isDrinker && (healthScore >= 8);
        
        System.out.println("Age: " + age);
        System.out.println("Smoker: " + isSmoker);
        System.out.println("Drinker: " + isDrinker);
        System.out.println("Health Score: " + healthScore);
        System.out.println("Premium Status: " + (eligible ? "Premium Applicable" : "Premium Not Applicable"));
    }
}