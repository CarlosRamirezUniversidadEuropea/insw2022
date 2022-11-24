package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{

    private double radio;
    private String color;
    private final double pi = 3.1416;

    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    @java.lang.Override
    public double calculatePerimeter() {
        return 2*pi*radio;
    }

    @java.lang.Override
    public double calculateArea() {
        return pi*(radio*radio);
    }

    @java.lang.Override
    public String toString() {
        return "El circulo tiene un radio de "+radio;
    }
}
