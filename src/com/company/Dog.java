package com.company;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public void callSound() {
        System.out.println("гав-гав ");
    }

    @Override
    public boolean print() {
        System.out.println("Информация об объекте с класса собаки: \nОбъект является собакой с именем " + getName() + ".\nИздает звук \"гав-гав\". " +
                "\nСобака выглядит вот так \uD83D\uDC15");
        return false;
    }
}
