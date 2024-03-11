import java.util.Random;

// Class to represent environmental sensors
class Sensor {
    private String name;
    private double value;

    // Constructor
    public Sensor(String name) {
        this.name = name;
        this.value = 0.0;
    }

    // Method to generate random sensor readings
    public void generateReading() {
        Random rand = new Random();
        this.value = rand.nextDouble() * 100; // Random value between 0 and 100
    }

    // Getter method for sensor value
    public double getValue() {
        return value;
    }

    // Method to display sensor information
    public void display() {
        System.out.println("Sensor Name: " + name);
        System.out.println("Sensor Value: " + value);
    }
}

// Class to represent the Environmental Monitoring System
public class EnvironmentalMonitoringSystem {
    public static void main(String[] args) {
        // Create sensor objects
        Sensor temperatureSensor = new Sensor("Temperature");
        Sensor humiditySensor = new Sensor("Humidity");
        Sensor airQualitySensor = new Sensor("Air Quality");

        // Generate random sensor readings
        temperatureSensor.generateReading();
        humiditySensor.generateReading();
        airQualitySensor.generateReading();

        // Display sensor information
        System.out.println("Environmental Monitoring System");
        System.out.println("--------------------------------");
        temperatureSensor.display();
        humiditySensor.display();
        airQualitySensor.display();
    }
}
