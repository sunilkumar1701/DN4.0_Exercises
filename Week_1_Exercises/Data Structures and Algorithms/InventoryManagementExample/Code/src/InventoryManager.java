import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add Product - O(1)
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added.");
    }

    // Update Product - O(1)
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.productName = name;
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product - O(1)
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product product : inventory.values()) {
            product.displayProduct();
        }
    }
}
