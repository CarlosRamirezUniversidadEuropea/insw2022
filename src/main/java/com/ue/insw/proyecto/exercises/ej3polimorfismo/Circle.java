package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {



    private int radius ; // Radius
    private double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Math.pi

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * pi * radius;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = pi * radius * radius;
        return area;

    }


    @Override
    public String toString() {
        return null;
    }
}
