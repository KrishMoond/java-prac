public class Rel {
    public static void main(String[] args) {

        Engine engine = new Engine("V8");  // independent object
        
        // Create tyres array
        Tyre[] tyres = new Tyre[4];
        tyres[0] = new Tyre("Michelin", 18);
        tyres[1] = new Tyre("Ralco", 13);
        tyres[2] = new Tyre("GoodYear", 12);
        tyres[3] = new Tyre("BKT", 16);
        
        Car car = new Car("BMW", 2020, engine, tyres);  // Car HAS Engine and Tyres

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Engine: " + car.getEngine().getType());
        
        // Display tyres
        System.out.println("Tyres:");
        for(int i = 0; i < car.getTyres().length; i++) {
            System.out.println("Tyre " + (i+1) + ": " + 
                car.getTyres()[i].getBrand() + " Size " + 
                car.getTyres()[i].getSize());
        }
        
        // Array reference example
        // System.out.println("Same tyre array? " + (tyres == car.getTyres()));
    }
}
