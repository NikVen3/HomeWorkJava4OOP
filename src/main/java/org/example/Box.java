package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(T Apple1, T Apple2, T Apple3) {
        this();
        addFruit(Apple1);
        addFruit(Apple2);
        addFruit(Apple3);
    }

    public Box(T Orange1, T Orange2) {
        this();
        addFruit(Orange1);
        addFruit(Orange2);

    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight(){
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<Apple> otherBox){
        return Math.abs(this.getWeight() - otherBox.getWeight())< 0.0001;
    }

    public void transfer(Box<? super T> otherBox){
        for (T fruit : fruits){
            otherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
