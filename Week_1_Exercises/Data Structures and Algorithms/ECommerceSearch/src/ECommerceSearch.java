import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search - O(n)
    public static Product linearSearch(Product[] products, String productName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search - O(log n)
    public static Product binarySearch(Product[] products, String productName) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(productName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    // Utility to sort by productName for binary search
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName));
    }
}
