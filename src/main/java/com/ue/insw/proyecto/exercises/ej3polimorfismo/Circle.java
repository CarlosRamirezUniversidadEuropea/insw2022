package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio;
    private String color;
    //final porque es una constante, no va a cambiar.
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
    }

    @Override
    public String toString() {
        String sRet = "El círculo tiene un radio " + radio;
        return sRet;
    }
}
