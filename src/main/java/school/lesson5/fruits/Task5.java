package school.lesson5.fruits;

public class Task5 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Orange orange = new Orange();

        GenericBox<Apple> boxApple = new GenericBox<Apple>();
        GenericBox<Orange> boxOrange = new GenericBox<Orange>();
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(apple1, orange);
    }
}
