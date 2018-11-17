package com.company;

import java.util.Arrays;

public class Person {
    public String name;
    public String surname;
    public String patronymic;
    public String DateBirth;
    public String fio;

    public void FIO() {
        System.out.println(surname + " " + name + " " + patronymic);
    }

    public void FIO2() {
        char n1 = name.charAt(0);
        char p1 = patronymic.charAt(0);
        System.out.println(surname + " " + n1 + "." + p1 + ".");
    }

    public void Age() {
        String a1 = DateBirth.substring(6, 10);
        int a2 = Integer.parseInt(a1);
        System.out.println(a2);
        int age = 2018 - a2;
        System.out.println(age + " years");
    }

    public void newFIO() {
        String[] mas = fio.split(" ");
        surname = mas[0];
        name = mas[1];
        patronymic = mas[2];
    }

    public Person() {
    }

    public Person(String name, String surname, String patronymic, String dateBirth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        DateBirth = dateBirth;
    }

    public Person(String fio) {
        this.fio = fio;
    }
}
