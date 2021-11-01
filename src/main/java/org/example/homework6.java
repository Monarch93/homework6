package org.example;

public class homework6 {
    public static void main(String[] args) {

        Animals[] animals = new Animals[10];
        animals[0] = new Cat("Чубаис",  200);
        animals[1] = new Cat("Шерстень", 250);
        animals[2] = new Cat("Крабичигоръ", 50);
        animals[3] = new Cat("Игорь", 250);
        animals[4] = new Cat("Ратлук", 450);
        animals[5] = new Dog("Кусака", 55, 500);
        animals[6] = new Dog("Маленький Помощник Санты", 15, 1500);
        animals[7] = new Dog("Бетховен", 60, 330);
        animals[8] = new Dog("Борзая",100, 150);
        animals[9] = new Dog("Пончик",50, 500);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
    }
}


