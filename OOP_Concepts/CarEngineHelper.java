class EngineHelper {
    private String type;
    
    public EngineHelper(String type) {
        this.type = type;
        System.out.println("Engine created when needed: " + type);
    }
    
    public String getType() {
        return type;
    }
}

public class CarEngineHelper {
    private String model;
    private EngineHelper engine; // Not created immediately
    
    public CarEngineHelper(String model) {
        this.model = model;
        System.out.println("Car created without engine");
    }
    
    // Helper method - creates engine when required
    private void createEngine() {
        if(engine == null) {
            engine = new EngineHelper("V6");
        }
    }
    
    public void startCar() {
        createEngine(); // Engine created only when needed
        System.out.println("Car started with " + engine.getType() + " engine");
    }
    
    public static void main(String[] args) {
        CarEngineHelper car = new CarEngineHelper("Toyota");
        System.out.println("Car object created, but no engine yet");
        
        car.startCar(); // Now engine is created
    }
}