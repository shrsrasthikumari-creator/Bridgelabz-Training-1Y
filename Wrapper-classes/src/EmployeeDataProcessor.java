import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessor {
    public static void main(String[] args) {
        // 1. Primitive array representing employee ages
        int[] rawAges = {22, 45, 30, 58, 19, 34, 42};

        // 2. New HR module expects an ArrayList of Integer objects
        ArrayList<Integer> ageList = new ArrayList<>();

        // 3. Convert int[] to ArrayList<Integer> (Autoboxing)
        for (int age : rawAges) {
            ageList.add(age);
        }

        // 4. Find youngest and oldest using Collections utility
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        // Output results
        System.out.println("Processed Employee Ages: " + ageList);
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}
