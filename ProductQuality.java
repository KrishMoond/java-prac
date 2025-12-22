class ProductQuality {
    public static void main(String[] args) {
        double weight = 480.0;  
        int qualityScore = 9;
        
         boolean accepted = (weight >= 450 && weight <= 550) && (qualityScore >= 8);
        
        System.out.println("Product Weight: " + weight + " grams");
        System.out.println("Quality Score: " + qualityScore);
        System.out.println("Product Status: " + (accepted ? "Accepted" : "Rejected"));
    }
}