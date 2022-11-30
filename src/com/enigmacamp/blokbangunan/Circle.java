package com.enigmacamp.blokbangunan;

class Circle implements IShape {
    private Integer r;
    private final Double pi = 3.14;
    private String name;

    Circle(String name, Integer r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + name);
    }

    @Override
    public Double area() {
        return r * pi;
    }
}

/*
Abstract Example

public class Circle extends Shape {
    // Radius
    private Integer r;
    private final Double pi = 3.14;

    Circle(String name, Integer r) {
        super(name);
        this.r = r;
    }

    @Override
    Double getRound() {
        return pi*r*2;
    }

    @Override
    Double getSurface() {
        return pi*r*r;
    }

    Double getHalfSurface() {
        return getSurface() / 2;
    }

    Double getHalfRound() {
        return getRound() / 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }
}

 */