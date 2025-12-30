public class CallExample {
    public static void main(String[] args) {
        // Calling the findMax method from MaxFinder class
        int max = MaxFinder.findMax(10, 20);
        System.out.println("Maximum value is: " + max);
        
        // Calling the h method from MaxFinder class
        MaxFinder.h();

        // Creating an instance of MaxFinder to call the non-static method s
        MaxFinder obj = new MaxFinder("Default Title");
        obj.s();

        MaxFinder obj2 = new MaxFinder("Sample Title");
        System.out.println("Object created with title: " + obj2.title);

        // Accessing static variable count
        MaxFinder.count = 5;
        System.out.println("Static count value: " + MaxFinder.count);
    }
}
