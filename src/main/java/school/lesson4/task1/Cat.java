package school.lesson4.task1;

import school.lesson4.task1.Animals;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Cat";
    }
        @Override
        public void swim(int dist) {
                System.out.println("Cat's no swim!");
        }

}
