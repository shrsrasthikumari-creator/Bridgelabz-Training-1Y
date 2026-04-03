import java.util.ArrayList;
import java.util.Objects;

public class StudentMarksReport {
    public static void main(String[] args) {
        // Different formats of input data
        Object[] rawInputs = {"85", 95, Integer.valueOf(88), "null", "abc", 72};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object input : rawInputs) {
            Integer convertedMark = convertToInteger(input);

            if (convertedMark != null) {
                validMarks.add(convertedMark);
            }
        }

        double sum = 0;
        for (Integer mark : validMarks) {
            sum += mark; // Auto-unboxing for calculation
        }

        double average = validMarks.isEmpty() ? 0 : sum / validMarks.size();

        System.out.println("Processed Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }

    public static Integer convertToInteger(Object input) {
        if (input == null) return null;

        try {
            if (input instanceof Integer) {
                return (Integer) input; // Already an Integer
            } else if (input instanceof String) {
                // Handle the literal string "null" or invalid text
                String str = (String) input;
                if (str.equalsIgnoreCase("null")) return null;
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            return null; // Ignore invalid formats like "abc"
        }
        return null;
    }
}
