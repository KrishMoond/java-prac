import java.util.*;

public class CarUpDownCast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select car type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. Luxury");

        int choice = sc.nextInt();

        Uber ride;

        // Create object based on user choice
        if (choice == 1) {
            ride = new Mini();   // upcasting
        } else if (choice == 2) {
            ride = new Sedan();  // upcasting
        } else if (choice == 3) {
            ride = new Luxury(); // upcasting
        } else {
            System.out.println("Invalid choice");
            return;
        }

        

        // Common method
        ride.bookRide();

        //Downcasting based on actual object
        if (ride instanceof Mini) {
            Mini m = (Mini) ride;
            m.mini();
        } 
        else if (ride instanceof Sedan) {
            Sedan s = (Sedan) ride;
            s.sedan();
        } 
        else if (ride instanceof Luxury) {
            Luxury l = (Luxury) ride;
            l.luxury();
        }
    }
}

class Uber {
    void bookRide() {
        System.out.println("Ride booked");
    }
}

class Mini extends Uber {
    void mini() {
        System.out.println("Mini ride selected");
    }
}

class Sedan extends Uber {
    void sedan() {
        System.out.println("Sedan ride selected");
    }
}

class Luxury extends Uber {
    void luxury() {
        System.out.println("Luxury ride selected");
    }
}
