class Animal {
    static String species;
    static int count;
    
    // Multiline static initializer
    static {
        System.out.println("Static initializer: Setting up Animal class");
        species = "Mammal";
        count = 0;
        System.out.println("Species set to: " + species);
        System.out.println("Initial count: " + count);
    }
    
    public static void sound() {
        System.out.println("Animal makes a sound");
    }
    
    public static void displayInfo() {
        System.out.println("Species: " + species + ", Count: " + count);
    }
}

class Cat extends Animal {
    public static void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheri {
    public static void main(String[] args) {
        System.out.println("About to access Animal class for first time...");
        
        // Static initializer runs AUTOMATICALLY when Animal class is first accessed
        Animal.displayInfo(); // This triggers static initializer
        
        System.out.println("\nCalling Animal methods again...");
        Animal.sound(); // Static initializer won't run again
        
        System.out.println("\nAccessing static variable directly...");
        System.out.println("Count value: " + Animal.count); // No initializer run
        
    }
}
