public class Product {
    public int productId;
    public String productName;
    public int quantity;
    public double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + productName +
                ", Quantity: " + quantity + ", Price: $" + price);
    }
}
