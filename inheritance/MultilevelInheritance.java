public class MultilevelInheritance {
    public static void main(String[] args) {
        RightAngleTriangle triangle = new RightAngleTriangle(10, 6);

        triangle.displayShape();
        triangle.displayTriangle();
        triangle.calculateArea();
    }
}

// Parent class
class Shape {
    String shapeName;

    // Constructor
    Shape(String shapeName) {
        this.shapeName = shapeName;
        System.out.println("Shape constructor called");
    }

    void displayShape() {
        System.out.println("Shape: " + shapeName);
    }
}

// Child class
class Triangle extends Shape {
    int base;
    int height;

    // Constructor
    Triangle(int base, int height) {
        super("Triangle"); // calling parent constructor
        this.base = base;
        this.height = height;
        System.out.println("Triangle constructor called");
    }

    void displayTriangle() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}

// Grandchild class
class RightAngleTriangle extends Triangle {

    // Constructor
    RightAngleTriangle(int base, int height) {
        super(base, height); // calling child constructor
        System.out.println("RightAngleTriangle constructor called");
    }

    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Right Angle Triangle: " + area);
    }
}
