abstract class Basic {
    abstract int add(int x, int y);
    abstract int sub(int x, int y);
    abstract int mul(int x, int y);
}

abstract class Calci extends Basic {
    abstract int power(int base, int exp);
}

abstract class Cal2 extends Calci {
    abstract int mod(int a, int b);
}

class Calculator extends Cal2 {

    @Override
    int add(int x, int y) {
        return x + y;
    }

    @Override
    int sub(int x, int y) {
        return x - y;
    }

    @Override
    int mul(int x, int y) {
        return x * y;
    }

    @Override
    int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    @Override
    int mod(int a, int b) {
        return a % b;
    }
}

public class ABasic {
    public static void main(String[] args) {

        Cal2 calc = new Calculator(); // abstraction + polymorphism

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.sub(10, 5));
        System.out.println("Multiplication: " + calc.mul(10, 5));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Modulus: " + calc.mod(10, 3));
    }
}
