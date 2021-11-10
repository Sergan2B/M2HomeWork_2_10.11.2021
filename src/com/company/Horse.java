package com.company;

import org.w3c.dom.NameList;

import java.net.IDN;

public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC0E");
    }

    @Override
    public void callSound() {
        System.out.println("И-го-го");
    }

    @Override
    public void print() {
        System.out.println("Информация об объекте с класса лошадь: \nОбъект является лошадью с именем " + getName() + ".\nИздает звук \"И-го-го\". " +
                "\nЛошадь выглядит вот так \uD83D\uDC0E");
    }
}
