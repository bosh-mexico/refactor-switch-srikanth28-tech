// Main Application
public class CheckoutDemo {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService();
        double amount = 150.75;

        service.checkout("PAYPAL", amount);
        service.checkout("GOOGLEPAY", amount);
        service.checkout("CREDITCARD", amount);
        service.checkout("BITCOIN", amount); // Unsupported
    }
    
    // Checkout Service (D - Dependency Inversion)
    class CheckoutService {
        public void checkout(String mode, double amount) {
            if (amount <= 0) {
                System.out.println("Invalid payment amount!");
                return;
            }
    
            PaymentProcessor processor = PaymentProcessorFactory.getProcessor(mode);
            if (processor != null) {
                processor.process(amount); // L - Liskov Substitution
            } else {
                System.out.println("Unsupported payment mode: " + mode);
            }
        }
    }
}
