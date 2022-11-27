package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Circle extends Shape{
    private double r;
    private String color;
    private final double PI=3.14;

    public Circle(double r, String color) {
        this.color=color;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
