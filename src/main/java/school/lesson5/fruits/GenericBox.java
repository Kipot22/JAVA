package school.lesson5.fruits;

import java.util.ArrayList;

class GenericBox<T>{
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList;

    void addFruit (T fruit) {
        if (currentWeight + 1 <= maxWeight){
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("the box is full");
    }


    float getWeight(Fruit f){
        return arrayList.size()*f.getWeight;
    }
    boolean compare(Fruit f1, Fruit f2){
        if (getWeight(f1) == getWeight(f2)){
            return true;
        } else return false;
    }
    public boolean campare(GenericBox box) {
        if (currentWeight == box.currentWeight) {
            return true;
        } else return false;
    }
}