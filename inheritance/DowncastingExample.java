public class DowncastingExample {
    public static void main(String[] args) {

        // Upcasting: Animal reference pointing to Dog object
        Animal a = new Dog();

        // Downcasting to Dog (safe)
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.speak();
            d.fetch();
        }

        // Upcasting: Animal reference pointing to Cat object
        Animal a2 = new Cat();

        //  Downcasting to Cat (safe)
        if (a2 instanceof Cat) {
            Cat c = (Cat) a2;
            c.meow();
        }

        // Unsafe downcast avoided
        Animal plain = new Animal();
        if (plain instanceof Dog) {
            Dog d2 = (Dog) plain; // will not execute
        } else {
            System.out.println("plain is not a Dog; avoid downcasting without instanceof");
        }

        // instanceof with Car
        Car c1 = new Car();
        System.out.println("c1 instanceof Car: " + (c1 instanceof Car));
        System.out.println("c1 instanceof Object: " + (c1 instanceof Object));

        Object obj = new Car();
        if (obj instanceof Car) {
            Car carRef = (Car) obj;
            carRef.drive();
        }
    }
}

class Animal {
    // common parent
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Car {
    void drive() {
        System.out.println("Car drives");
    }
}
