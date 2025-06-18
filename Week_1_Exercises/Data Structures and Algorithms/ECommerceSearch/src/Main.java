public class Main {
    public static void main(String[] args) {
        // Setup: Product array
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shirt", "Clothing"),
                new Product(103, "Book", "Education"),
                new Product(104, "Headphones", "Electronics"),
                new Product(105, "Shoes", "Footwear")
        };

        // Linear Search Example
        System.out.println("Linear Search for 'Book':");
        Product foundLinear = ECommerceSearch.linearSearch(products, "Book");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        // Sort for Binary Search
        ECommerceSearch.sortProductsByName(products);

        // Binary Search Example
        System.out.println("\nBinary Search for 'Book':");
        Product foundBinary = ECommerceSearch.binarySearch(products, "Book");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");


    }
}
