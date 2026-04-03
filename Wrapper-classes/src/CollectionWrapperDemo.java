import java.util.ArrayList;
import java.util.Collections;

public class CollectionWrapperDemo {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> priceList = new ArrayList<>();

        for (double p : prices) {
            priceList.add(p);
        }

        double maxPrice = Collections.max(priceList);

        double sum = 0;
        for (Double p : priceList) {
            sum += p;
        }
        double averagePrice = sum / priceList.size();

        System.out.println("Price List: " + priceList);
        System.out.println("Highest Price: " + maxPrice);
        System.out.println("Average Price: " + averagePrice);
    }
}
