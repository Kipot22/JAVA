package school.lesson4.task3;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.PaymentInner innerPayment = payment.new PaymentInner("Milk", 50);
        Payment.PaymentInner innerPayment2 = payment.new PaymentInner("Meat", 150);
        innerPayment.print();

    }

}
