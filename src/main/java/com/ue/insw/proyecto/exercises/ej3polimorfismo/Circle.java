package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {


    private  double area ; // Area
    private int radius ; // Radius
    private double pi = 3.14;
    private double perimeter; //Perimeter


    // Math.pi

    @Override
    public double calculatePerimeter() {
        perimeter = 2 * pi * radius;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        area = pi * radius * radius;
        return area;

    }


    @Override
    public String toString() {
        return null;
    }
}
