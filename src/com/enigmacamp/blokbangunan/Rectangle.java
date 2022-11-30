package com.enigmacamp.blokbangunan;

public class Rectangle implements IShape {
    Double length, width;
    String name;

    Rectangle(String name, Double length, Double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Draw");
    }

    @Override
    public Double area() {
        return length * width;
    }
}

/*
Abstract Example


public class Rectangle extends Shape {
    protected Double length;
    protected Double width;

    Rectangle(String name, Double length, Double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    Double getSurface() {
        return this.length * this.width;
    }

    @Override
    Double getRound() {
        return 2*(this.length * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

 */