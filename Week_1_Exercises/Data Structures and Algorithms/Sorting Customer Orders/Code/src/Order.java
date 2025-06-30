public class Order {
    public int orderId;
    public String customerName;
    public double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.println("OrderID: " + orderId + ", Customer: " + customerName + ", Total Price: $" + totalPrice);
    }
}
