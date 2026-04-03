public class SignupValidator {
    public static void main(String[] args) {
        // Test cases
        String[] inputs = {"25", "17", "abc", "18", "-5"};

        for (String input : inputs) {
            boolean isValid = isAgeValid(input);
            System.out.println("Input: \"" + input + "\" -> Eligible: " + isValid);
        }
    }

    public static boolean isAgeValid(String ageStr) {
        try {
            // Convert String to primitive int
            int age = Integer.parseInt(ageStr);

            // Check if the user is 18 or older
            return age >= 18;

        } catch (NumberFormatException e) {
            // If parsing fails (e.g., "abc"), return false
            return false;
        }
    }
}
