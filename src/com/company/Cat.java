package com.company;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public void callSound() {
        System.out.println("мяуу ");
    }

    @Override
    public void print() {
        System.out.println("Информация об объекте с класса кота: \nОбъект является котом с именем " + getName() + ".\nИздает звук \"мяуу\". " +
                "\nКот выглядит вот так \uD83D\uDC15");
    }
}
