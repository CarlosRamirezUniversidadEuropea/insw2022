package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import com.ue.insw.proyecto.exercises.ej3polimorfismo.Shape;

//todo extends shape
public class Circle extends Shape{

    public Circle(String color){
        super(color);
    }

    public double calculatePerimeter() {
        double perimeter = 0, radius = 0;

        perimeter = 2 * Math.PI * radius;

        return perimeter;
    }

    public double calculateArea() {
        double area = 0, radius = 0;

        area = Math.PI * (Math.pow(radius, 2));

        return area;
    }

    public String toString() {
        return null;
    }

}
