class ScholarshipEligibility {
    public static void main(String[] args) {
        int marks = 85;
        double familyIncome = 45000.0;
        boolean hasSportsQuota = false;
        boolean hasNCCCertificate = true;
        
         boolean eligible = (marks >= 80) && (familyIncome < 50000) && (hasSportsQuota || hasNCCCertificate);
        
        System.out.println("Marks: " + marks);
        System.out.println("Family Income: " + familyIncome);
        System.out.println("Sports Quota: " + hasSportsQuota);
        System.out.println("NCC Certificate: " + hasNCCCertificate);
        System.out.println("Scholarship Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
    }
}