package com.company;

public class Main {

    public static void main(String[] args) {
        Person o1 = new Person("Ivan", "Ivanov", "Ivanovich", "24.03.1993");
        Person o2 = new Person("Alekseenko Irina Pavlovna");
        o1.FIO();
        o1.FIO2();
        o1.Age();
        o2.newFIO();
        o2.FIO();
    }
}
