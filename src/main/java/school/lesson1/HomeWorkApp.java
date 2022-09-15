package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {
        int value = 36;
        if (value <= 0) {
            System.out.println("Червоний");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        }
        if (value > 100) {
            System.out.println("Зелений");
        }

    }

    public static void compareNumbers() {
        int a = 5;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
