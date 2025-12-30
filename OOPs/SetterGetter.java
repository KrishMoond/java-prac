class SetterGetter {
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0) { 
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        SetterGetter person = new SetterGetter();
        
        // Using setter methods
        person.setName("setter getter example");
        person.setAge(25);
        
        // Using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
