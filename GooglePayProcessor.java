  // GooglePay Implementation
  class GooglePayProcessor implements PaymentProcessor {
      public void process(double amount) {
          System.out.println("Processing GooglePay payment of $" + String.format("%.2f", amount));
          // Add GooglePay-specific logic here
      }
  }
