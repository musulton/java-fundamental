package com.enigmacamp.blokbangunan;

public abstract class Shape {
    String objectName = "";

    Shape(String name) {
        this.objectName = name;
    }

    public String getName() {
        return this.objectName;
    }

    abstract Double getRound();
    abstract Double getSurface();
}
