public class StaticInital {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initialization Block non static");
    }

    StaticInital() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Static Initialization Example");
        StaticInital obj = new StaticInital();
    }

    static {
        System.out.println("Second Static Block");
    }
}
