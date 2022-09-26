package school.lesson4.task1;

import school.lesson4.task1.Cat;
import school.lesson4.task1.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Pushok");
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Bobik");
        System.out.println();
        dog1.info();
        dog2.info();
        System.out.println();
        dog1.run(150);
        dog1.swim(10);
        System.out.println();
        cat1.run(150);
        cat1.swim(10);
        cat1.info();
        cat2.info();
    }
}
