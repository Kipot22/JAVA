package school.lesson4.task2;

import school.lesson4.NewCat;
import school.lesson4.Plate;

public class MainClass {

    public static void main(String[] args) {

        NewCat[] allCats = new NewCat[4];
        allCats[0] = new NewCat("Venik", 5);
        allCats[1] = new NewCat("Senik", 40);
        allCats[2] = new NewCat("Fenik", 30);
        allCats[3] = new NewCat("Konik", 35);


        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            allCats[i].eat(plate);
            plate.info();
        }
    }
}
