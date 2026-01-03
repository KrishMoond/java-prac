class CPU {
    private String model;
    
    public CPU(String model) {
        this.model = model;
        System.out.println("CPU created: " + model);
    }
    
    public String getModel() {
        return model;
    }
}

class RAM {
    private int size;
    
    public RAM(int size) {
        this.size = size;
        System.out.println("RAM created: " + size + "GB");
    }
    
    public int getSize() {
        return size;
    }
}

public class ComputerComponents {
    private String brand;
    private CPU cpu;
    private RAM ram;
    
    public ComputerComponents(String brand) {
        this.brand = brand;
        this.cpu = new CPU("Intel i7"); // CPU created immediately
        this.ram = new RAM(16); // RAM created immediately
    }
    
    public void display() {
        System.out.println("Computer: " + brand);
        System.out.println("CPU: " + cpu.getModel());
        System.out.println("RAM: " + ram.getSize() + "GB");
    }
    
    public static void main(String[] args) {
        ComputerComponents computer = new ComputerComponents("Dell");
        computer.display();
    }
}