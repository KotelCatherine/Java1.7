package ru.geekbrains.java1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int appetite) {
        if (appetite > food) {
            return -1;
        } else {
            return food -= appetite;
        }
    }

    public void foodAdd() {
        food += 20;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
