public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Alice", 250.0),
                new Order(102, "Bob", 100.0),
                new Order(103, "Charlie", 400.0),
                new Order(104, "Diana", 150.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) o.display();

        // Use Bubble Sort
        OrderSorter.bubbleSort(orders);
        System.out.println("\nSorted by Bubble Sort:");
        for (Order o : orders) o.display();

        // Reset orders
        orders = new Order[] {
                new Order(101, "Alice", 250.0),
                new Order(102, "Bob", 100.0),
                new Order(103, "Charlie", 400.0),
                new Order(104, "Diana", 150.0)
        };

        // Use Quick Sort
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nSorted by Quick Sort:");
        for (Order o : orders) o.display();
    }
}
