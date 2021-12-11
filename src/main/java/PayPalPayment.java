public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println(String.format("Payment of %s € with PayPal completed", amount));
    }

}
