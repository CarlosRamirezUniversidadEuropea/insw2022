package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{

    private int width;
    private int height;


    public Rectangle (int width,int height){

        this.width = width;//radio
        this.height = height;

    }

    @Override
    public double calculateArea() {
        double area1 = width * height;
        return area1;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter1 = 2 + (height + width);
        return perimeter1;
    }

    @Override
    public String toString() {
        return null;
    }
}
