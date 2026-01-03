class Sim {
    private String carrier;
    private String number;
    
    public Sim(String carrier, String number) {
        this.carrier = carrier;
        this.number = number;
        System.out.println("SIM created: " + carrier + " - " + number);
    }
    
    public String getCarrier() {
        return carrier;
    }
    
    public String getNumber() {
        return number;
    }
}

public class SmartphoneSim {
    private String brand;
    private Sim sim; // Not created immediately
    
    public SmartphoneSim(String brand) {
        this.brand = brand;
        System.out.println("Smartphone created without SIM");
    }
    
    // Create SIM only when required
    public void insertSim(String carrier, String number) {
        if(sim == null) {
            sim = new Sim(carrier, number);
            System.out.println("SIM inserted into " + brand);
        } else {
            System.out.println("SIM already exists");
        }
    }
    
    public void makeCall() {
        if(sim != null) {
            System.out.println("Making call from " + sim.getNumber());
        } else {
            System.out.println("No SIM card! Cannot make call");
        }
    }
    
    public static void main(String[] args) {
        SmartphoneSim phone = new SmartphoneSim("iPhone");
        
        phone.makeCall(); // No SIM yet
        
        phone.insertSim("Verizon", "123-456-7890"); // SIM created when needed
        phone.makeCall(); // Now can make call
    }
}