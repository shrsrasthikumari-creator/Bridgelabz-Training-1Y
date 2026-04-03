import java.util.ArrayList;

public class PerformanceBenchmark {
    public static void main(String[] args) {
        int size = 1_000_000;

        // --- Benchmark for Primitive int[] ---
        long startTime = System.currentTimeMillis();
        int[] primitiveArray = new int[size];
        long sumPrimitive = 0;

        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }
        for (int num : primitiveArray) {
            sumPrimitive += num;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Primitive int[] Time: " + (endTime - startTime) + "ms");

        // --- Benchmark for ArrayList<Integer> ---
        startTime = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(size);
        long sumWrapper = 0;

        for (int i = 0; i < size; i++) {
            list.add(i); // Autoboxing happens here
        }
        for (Integer num : list) {
            sumWrapper += num; // Unboxing happens here
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> Time: " + (endTime - startTime) + "ms");
    }
}
