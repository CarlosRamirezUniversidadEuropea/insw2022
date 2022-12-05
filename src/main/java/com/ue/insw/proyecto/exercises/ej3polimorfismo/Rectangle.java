package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{

    private int width;
    private int height;
    private int length;
    private int area1;
    private int perimeter1;

    @Override
    public double calculateArea() {
        area1 = width * height;
        return area1;
    }

    @Override
    public double calculatePerimeter() {
        perimeter1 = 2 + (length + width);
        return perimeter1;
    }

    @Override
    public String toString() {
        return null;
    }
}
