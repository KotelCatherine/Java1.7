package ru.geekbrains.java1;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety; //сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite =  appetite;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite) < 0) {
            satiety = false;
            plate.foodAdd(); //наполняем тарелку
        } else {
            satiety = true;
        }
    }

    public void info() {
        System.out.println("Cat "+ name + " is full: " + satiety);
    }
}
