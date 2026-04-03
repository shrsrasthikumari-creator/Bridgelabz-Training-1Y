public class ShoppingCart {
    public static void main(String[] args) {
        String[] itemPrices = {"250", "499", "abc", "99", "invalid", "150"};

        int totalCartPrice = 0;
        int processedItems = 0;
        int failedItems = 0;

        System.out.println("--- Processing Shopping Cart ---");

        for (String priceStr : itemPrices) {
            try {
                // Convert string to primitive int using Wrapper method
                int price = Integer.parseInt(priceStr);
                totalCartPrice += price;
                processedItems++;
                System.out.println("Added item: " + price);
            } catch (NumberFormatException e) {
                // This block runs if parseInt fails (e.g., for "abc")
                System.out.println("Skipping invalid price format: \"" + priceStr + "\"");
                failedItems++;
            }
        }

        System.out.println("\n--- Cart Summary ---");
        System.out.println("Successfully added: " + processedItems + " items");
        System.out.println("Failed to add: " + failedItems + " items");
        System.out.println("Total Amount Due: " + totalCartPrice);
    }
}
