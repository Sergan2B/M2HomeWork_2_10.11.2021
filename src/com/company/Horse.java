package com.company;

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
    public boolean print() {
        System.out.println("Информация об объекте с класса лошадь: \nОбъект является лошадью с именем " + getName() + ".\nИздает звук \"И-го-го\". " +
                "\nЛошадь выглядит вот так \uD83D\uDC0E");
        return false;
    }
}
