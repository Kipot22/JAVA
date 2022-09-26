package school.lesson4;

public class NewCat {
    private String name;
    private int appetite;
    private boolean fullness = false;

    public NewCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }
    public void eat(school.lesson4.Plate p) {

        if (p.decreaseFood(appetite)) {
            fullness = true;
        }
    }

}
