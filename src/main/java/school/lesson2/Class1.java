package school.lesson2;

public class Class1 {
    public static void main(String[] args) {
        System.out.println(method1(8, 6));
        method2(3);
        System.out.println(method3(6));
    }
// 1.     Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false.
    public static boolean method1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }
// 2.     Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
    public static void method2(int a) {
        if (a >= 0) {
            System.out.println("Позитивне число");
        } else {
            System.out.println("Негативне число");
        }
    }
// 3.     Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// Замечание: ноль считаем положительным числом.
    public static boolean method3(int a) {
        if (a >= 0) {
            return true;
        } else return false;
    }
}

