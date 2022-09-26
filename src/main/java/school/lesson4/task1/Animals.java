package school.lesson4.task1;

import java.util.Random;

public class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    Random random = new Random();

    public Animals(String name) {
        this.name = name;
    }
    public void run(int dist) {
        if (this.maxRun >= dist) {
            System.out.println(this.type + " " + this.name + " has run " + dist + " m");
        }
        else {
            System.out.println(this.type + " " + this.name + " can't run ");
        }
    }
    public void swim(int dist) {
        if (this.maxSwim >= dist) {
            System.out.println(this.type + " " + this.name + " has swum " + dist + " m");
        }
        else {
            System.out.println(this.type + " " + this.name + " can't swim ");
        }
    }
    public void info() {
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m.");
    }
}
