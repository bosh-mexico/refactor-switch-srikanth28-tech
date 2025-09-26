  public class Creditcard_processor{
      // CreditCard Implementation
      class CreditCardProcessor implements PaymentProcessor {
          public void process(double amount) {
              System.out.println("Processing Credit Card payment of $" + String.format("%.2f", amount));
              // Add Credit Card-specific logic here
          }
      }
  }
