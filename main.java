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
}
