// PayPal Implementation
class PayPalProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + String.format("%.2f", amount));
        // Add PayPal-specific logic here
    }
}
