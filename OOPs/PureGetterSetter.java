public class PureGetterSetter {
    private String name;
    private int age;
    private String city;

    // Pure setter methods that return this for chaining
    public PureGetterSetter setName(String name) {
        this.name = name;
        return this;
    }

    public PureGetterSetter setAge(int age) {
        this.age = age;
        return this;
    }

    public PureGetterSetter setCity(String city) {
        this.city = city;
        return this;
    }

    // Pure getter methods - return actual values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        PureGetterSetter person = new PureGetterSetter();
        
        // Method chaining with setters only
        person.setName("Alice").setAge(25).setCity("New York");
        
        // Display using getters (separate calls)
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
        
        
        // Create object and chain setters in one line
        PureGetterSetter person2 = new PureGetterSetter().setName("Bob").setAge(30).setCity("London");
            
        // Display values
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge() + ", City: " + person2.getCity());
        
        System.out.println("\n=== Inline display with getters ===");
        
        // Chain setters and immediately use getters
        System.out.println("Name: " + new PureGetterSetter().setName("Charlie").getName());
            
        System.out.println("Complete info: " + 
            new PureGetterSetter().setName("Diana").setAge(28).setCity("Paris").getName() + " is " + 
            new PureGetterSetter().setName("Diana").setAge(28).setCity("Paris").getAge() + " years old from " +
            new PureGetterSetter().setName("Diana").setAge(28).setCity("Paris").getCity());
    }
}