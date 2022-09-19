package school.lesson2;

public class Class2 {
    public static void main(String[] args) {
        method4("Veronika", 8);
        System.out.println(year(2020));
    }

    //4.     Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void method4(String row, int i) {
        for (i = 0; i < 10; i++) {
            System.out.println(row);
        }
    }
    // * Написать метод, который определяет, является ли год високосным, и возвращает
    // boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean year(int y) {
        if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0)))
            return false;
        else return true;
    }
}

