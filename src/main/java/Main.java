public class Main {

    public static void main(String[] args) {
        PaymentStrategy strategy;

        String paymentMethod = "creditcard";
        if (paymentMethod.equals("paypal")) {
            strategy = new CreditCardPayment();
        } else {
            strategy = new PayPalPayment();
        }

        strategy.pay(100);
    }

}
