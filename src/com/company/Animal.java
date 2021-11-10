package com.company;

public abstract class Animal implements Drawable, SoundProducable, Printable{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
