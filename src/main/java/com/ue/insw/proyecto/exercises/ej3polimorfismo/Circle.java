package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{

    private double radio;
    private String color;
    private final double pi = 3.141592653589793;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radio;
    }

    @Override
    public double calculateArea() {
        return pi*(radio*radio);
        //return pi*Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "El circulo tiene un radio de " + radio;
    }
}
