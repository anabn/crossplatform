package com.differentmvc.model;

public class Circle extends Shape{
    private double radius;
    private double pi = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return  pi * Math.pow(radius, 2);
    }

}
