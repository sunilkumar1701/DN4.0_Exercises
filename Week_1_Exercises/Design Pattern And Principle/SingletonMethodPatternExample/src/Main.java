public class Main {
    public static void main(String[] args) {
        System.out.println("Requesting the first instance of Logger...");
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log entry.");

        System.out.println("\nRequesting the Logger again...");
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log entry.");

        System.out.println("\nAre both logger instances the same?");
        if (logger1 == logger2) {
            System.out.println("Yes, both are the same instance. Singleton works perfectly!");
        } else {
            System.out.println("No, they are different instances. Something is wrong.");
        }
    }
}
