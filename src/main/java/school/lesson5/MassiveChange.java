package school.lesson5;

import java.util.Arrays;

public class MassiveChange {
    public static void main(String[] args) {
        String[] mass = {"one", "two", "three", "four", "five"};
        System.out.println("Was" + Arrays.toString(mass));
        swapElemets(mass, 1, 3);
        System.out.println("Change to" + Arrays.toString(mass));
    }

    private static <T> void swapElemets(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
