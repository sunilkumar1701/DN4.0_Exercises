public class WebApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("WebApp - " + stockName + " is now $" + price);
    }
}
