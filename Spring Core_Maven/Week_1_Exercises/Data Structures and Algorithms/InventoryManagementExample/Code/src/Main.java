import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            int id;
            String name;
            int qty;
            double price;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    name = scanner.next();
                    System.out.print("Enter Quantity: ");
                    qty = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    id = scanner.nextInt();
                    System.out.print("Enter New Name: ");
                    name = scanner.next();
                    System.out.print("Enter New Quantity: ");
                    qty = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    price = scanner.nextDouble();
                    manager.updateProduct(id, name, qty, price);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextInt();
                    manager.deleteProduct(id);
                    break;

                case 4:
                    manager.displayInventory();
                    break;

                case 5:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
