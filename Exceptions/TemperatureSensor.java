import java.util.Scanner;

class TemperatureOutOfRangeException extends Exception {
    TemperatureOutOfRangeException(String message) {
        super(message);
    }
}

public class TemperatureSensor {
    
    static void checkTemperature(int temp) throws TemperatureOutOfRangeException {
        if (temp < -50 || temp > 100) {
            throw new TemperatureOutOfRangeException("Temperature " + temp + "°C is out of range (-50 to 100)");
        }
        System.out.println("Temperature " + temp + "°C is normal");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        int temperature = sc.nextInt();
        
        try {
            checkTemperature(temperature);
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}