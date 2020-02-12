package com.differentmvc.model;

public abstract class Shape{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName()+
                ", color = " + color;
    }

    public abstract double calcArea();

    public String draw() { return this + ", area: " + calcArea();}

}
