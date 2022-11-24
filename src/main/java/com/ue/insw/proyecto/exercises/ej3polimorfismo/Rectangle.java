package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import com.ue.insw.proyecto.exercises.ej3polimorfismo.Shape;

//todo extends shape
public class Rectangle extends Shape{

    public Rectangle(String color){
        super(color);
    }

    public double calculatePerimeter() {
        double perimeter = 0, width = 0, length = 0;

        perimeter = (width * 2) + (length * 2);

        return perimeter;
    }

    public double calculateArea() {
        double area = 0, width = 0, length = 0;

        area = width * length;

        return area;
    }

    public String toString() {
        return null;
    }
}
