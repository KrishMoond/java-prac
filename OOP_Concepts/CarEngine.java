class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
        System.out.println("Engine created: " + type);
    }
    
    public String getType() {
        return type;
    }
}

public class CarEngine {
    private String model;
    private Engine engine;
    
    public CarEngine(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine created immediately
    }
    
    public void display() {
        System.out.println("Car: " + model);
        System.out.println("Engine: " + engine.getType());
    }
    
    public static void main(String[] args) {
        CarEngine car = new CarEngine("BMW", "V8");
        car.display();
    }
}