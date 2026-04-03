import java.util.ArrayList;

public class SensorDataLogger {
    public static void main(String[] args) {
        // A list that can only hold Double objects
        ArrayList<Double> sensorHistory = new ArrayList<>();

        // 1. Primitive data from a hardware sensor
        double rawTemp1 = 22.5;
        double rawTemp2 = 23.8;

        // 2. Data from a digital wrapper/database
        Double objectTemp = 24.1;

        // Auto-boxing: Primitives are automatically converted to Objects
        logData(sensorHistory, rawTemp1);
        logData(sensorHistory, rawTemp2);
        logData(sensorHistory, objectTemp);

        // 3. Processing the data
        System.out.println("--- Sensor Analytics ---");
        displayAverage(sensorHistory);
    }

    // Method accepts a Double object, but can take a primitive double thanks to autoboxing
    public static void logData(ArrayList<Double> list, Double value) {
        list.add(value);
        System.out.println("Logged temperature: " + value + "°C");
    }

    public static void displayAverage(ArrayList<Double> list) {
        double sum = 0;
        for (Double val : list) {
            // Auto-unboxing: Object is automatically converted back to primitive for math
            sum += val;
        }

        if (!list.isEmpty()) {
            System.out.println("Average Temperature: " + (sum / list.size()) + "°C");
        }
    }
}
