// Main Checkout Demo
public class CheckoutDemo {
    public static void checkout(String mode, double amount) {
        PaymentProcessor processor = PaymentProcessorFactory.getProcessor(mode);
        if (processor != null) {
            processor.process(amount);
        } else {
            System.out.println("Invalid payment mode selected!");
        }
    }

    public static void main(String[] args) {
        double amount = 150.75;

        checkout("PAYPAL", amount);
        checkout("GOOGLEPAY", amount);
        checkout("CREDITCARD", amount);
        checkout("BITCOIN", amount); // Unsupported mode
    }
}

