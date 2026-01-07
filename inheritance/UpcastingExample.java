public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: a Dog object referenced by an Animal variable
        Animal a = new Dog(); // implicit upcast
        a.speak(); // calls Dog's overridden speak() method

        // The following would not compile because fetch() is not in Animal:
        // a.fetch();
    }
}

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

