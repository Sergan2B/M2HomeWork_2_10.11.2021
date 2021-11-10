package com.company;

public class Circle extends Figure {
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
