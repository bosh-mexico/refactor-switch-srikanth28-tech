// Factory (O - Open/Closed)
public class PaymentProcessorFactory {
    public static PaymentProcessor getProcessor(String mode) {
        return switch (mode.toUpperCase()) {
            case "PAYPAL" -> new PayPalProcessor();
            case "GOOGLEPAY" -> new GooglePayProcessor();
            case "CREDITCARD" -> new CreditCardProcessor();
            default -> null;
        }
    }
}
