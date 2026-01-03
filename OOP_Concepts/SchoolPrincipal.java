class Principal {
    private String name;
    private int experience;
    
    public Principal(String name, int experience) {
        this.name = name;
        this.experience = experience;
        System.out.println("Principal assigned: " + name);
    }
    
    public String getName() {
        return name;
    }
    
    public int getExperience() {
        return experience;
    }
}

public class SchoolPrincipal {
    private String schoolName;
    private Principal principal;
    
    public SchoolPrincipal(String schoolName) {
        this.schoolName = schoolName;
        this.principal = new Principal("Dr. Smith", 15); // Principal created immediately
    }
    
    public void display() {
        System.out.println("School: " + schoolName);
        System.out.println("Principal: " + principal.getName());
        System.out.println("Experience: " + principal.getExperience() + " years");
    }
    
    public static void main(String[] args) {
        SchoolPrincipal school = new SchoolPrincipal("ABC High School");
        school.display();
    }
}