public class WrapperUtilities {
    public static void main(String[] args) {
        // Parsing Methods
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("3.14");
        boolean boolVal = Boolean.parseBoolean("true");

        // Radix/String Conversions
        String binaryStr = Integer.toBinaryString(10);

        // Character Utilities
        boolean checkDigit = Character.isDigit('5');
        char upperCase = Character.toUpperCase('a');

        // Output Results
        System.out.println("Integer.parseInt(\"123\"): " + intVal);
        System.out.println("Double.parseDouble(\"3.14\"): " + doubleVal);
        System.out.println("Boolean.parseBoolean(\"true\"): " + boolVal);
        System.out.println("Integer.toBinaryString(10): " + binaryStr);
        System.out.println("Character.isDigit('5'): " + checkDigit);
        System.out.println("Character.toUpperCase('a'): " + upperCase);
    }
}
