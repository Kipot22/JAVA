package school.lesson4.task1;

import school.lesson4.task1.Animals;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = 500;
        this.maxSwim = 10;
    }
}
