public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price...");
        stockMarket.setStockPrice("AAPL", 172.35);

        System.out.println("\nRemoving WebApp observer...");
        stockMarket.removeObserver(webApp);

        System.out.println("Updating stock price again...");
        stockMarket.setStockPrice("AAPL", 174.50);
    }
}
