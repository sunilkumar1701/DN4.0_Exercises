public class Main {
    public static void main(String[] args) {
        // Base notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS notification
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack notification
        notifier = new SlackNotifierDecorator(notifier);

        // Send the message
        notifier.send("Your order has been shipped!");
    }
}
