public class BankLimitHandler {
    public static void main(String[] args) {
        // Test cases: New account (Double object), Old account (primitive), and Null
        Double modernLimit = 5000.0;
        double oldLimit = 2500.0;
        Double missingLimit = null;

        System.out.println("Remaining (Modern): " + getRemainingLimit(modernLimit, 1200.0));
        System.out.println("Remaining (Old): " + getRemainingLimit(oldLimit, 500.0));
        System.out.println("Remaining (Null Case): " + getRemainingLimit(missingLimit, 100.0));
    }

    public static double getRemainingLimit(Double dailyLimit, double spentAmount) {
        // 1. Handle the null case first to avoid NullPointerException
        if (dailyLimit == null) {
            return 0.0;
        }

        // 2. Calculate remaining limit (Auto-unboxing occurs here)
        double remaining = dailyLimit - spentAmount;

        // 3. Ensure we don't return a negative limit
        return Math.max(0.0, remaining);
    }
}
