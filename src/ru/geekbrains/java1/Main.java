package ru.geekbrains.java1;

public class Main {

    public static void main(String[] args) {
	Cat[] cat = new Cat[7];
    cat[0] = new Cat("Gamora", 5);
    cat[1] = new Cat("Barsik", 5);
    cat[2] = new Cat("Murzik", 5);
    cat[3] = new Cat("Alisa", 5);
    cat[4] = new Cat("Vova", 50);
    cat[5] = new Cat("Eg", 10);
    cat[6] = new Cat("Igor", 5);
    Plate plate = new Plate(20);
    plate.info();

    for (Cat catArr: cat) {
        catArr.eat(plate); //отправляем кота есть
        catArr.info(); //сытость кота

        while (!catArr.satiety) { //пока кот голодный наполняем ему тарелку
            catArr.eat(plate); //после наполнения тарелки достаточным количеством отправляем его есть
            catArr.info();
        }
    }

    plate.info(); // остаток в тарелке
    }
}
