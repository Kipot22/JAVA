package school.lesson4.task3;

public class Payment {
    private String name;
    private int price;

    public class PaymentInner {
        public PaymentInner() {

        }

        public PaymentInner(String text, int price) {
            System.out.println(text + " " + price);

        }

        public void print() {
            System.out.println("Print");
        }
    }
}

