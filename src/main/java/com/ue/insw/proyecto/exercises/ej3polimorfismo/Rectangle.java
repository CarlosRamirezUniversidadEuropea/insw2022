package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return (width * 2) + (length * 2);
    }

    public double calculateArea() {
        return width * length;
    }

    public String toString() {
        return "Este rectangulo tiene una base de " +length+ " y una altura de " +width;
    }
}
