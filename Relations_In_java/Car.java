public class Car {
    private String model;
    private int year;
    private Engine engine;  // Composition - Car HAS Engine
    private Tyre[] tyres;   // Array of tyres
    
    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        // Create 4 default tyres
        this.tyres = new Tyre[4];
        for(int i = 0; i < 4; i++) {
            this.tyres[i] = new Tyre("Default", 16);
        }
    }
    
    public Car(String model, int year, Engine engine, Tyre[] tyres) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.tyres = tyres;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public Tyre[] getTyres() {
        return tyres;
    }
}