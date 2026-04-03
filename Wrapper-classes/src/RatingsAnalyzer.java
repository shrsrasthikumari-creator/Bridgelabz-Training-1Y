import java.util.ArrayList;
import java.util.Objects;

public class RatingsAnalyzer {
    public static void main(String[] args) {
        // 1. Old system data (Primitives)
        int[] oldRatings = {4, 5, 3, 5};

        // 2. New system data (Objects - contains a null)
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(4);
        newRatings.add(null);
        newRatings.add(5);

        // 3. Unified list for analysis
        ArrayList<Integer> combinedRatings = new ArrayList<>();

        // Merge old ratings (Autoboxing: int -> Integer)
        for (int rating : oldRatings) {
            combinedRatings.add(rating);
        }

        // Merge new ratings (Filtering nulls)
        for (Integer rating : newRatings) {
            if (Objects.nonNull(rating)) {
                combinedRatings.add(rating);
            }
        }

        // 4. Calculate Average (Auto-unboxing: Integer -> int)
        double sum = 0;
        for (Integer rating : combinedRatings) {
            sum += rating;
        }

        double average = combinedRatings.isEmpty() ? 0 : sum / combinedRatings.size();

        System.out.println("Combined Ratings: " + combinedRatings);
        System.out.println("Average Rating: " + average);
    }
}