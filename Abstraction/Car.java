package Abstraction;

abstract class Fac{
    private boolean isSedan;
    private int seat;

    Fac(boolean isSedan, int seat){
        this.isSedan = isSedan;
        this.seat = seat;
    }

    public boolean getSedan() {
        return isSedan;
    }

    public int getSeat() {
        return seat;
    }

    abstract int getMileage();

}

class Wagnor extends Fac{
    Wagnor(boolean isSedan, int seat){
        super(isSedan, seat);
    }

    @Override
    int getMileage() {
        return 21;
    }
}

public class Car {
    public static void main(String[] args) {
        Wagnor w = new Wagnor(false, 5);
        System.out.println("Is Sedan: " + w.getSedan());
        System.out.println("Seats: " + w.getSeat());
        System.out.println("Mileage: " + w.getMileage());
    }
}
