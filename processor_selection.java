public class processor_selection {
  class PaymentProcessorFactory {
      public static PaymentProcessor getProcessor(String mode) {
          switch (mode.toUpperCase()) {
              case "PAYPAL":
                  return new PayPalProcessor();
              case "GOOGLEPAY":
                  return new GooglePayProcessor();
              case "CREDITCARD":
                  return new CreditCardProcessor();
              default:
                  return null;
          }
      }
  }
}
