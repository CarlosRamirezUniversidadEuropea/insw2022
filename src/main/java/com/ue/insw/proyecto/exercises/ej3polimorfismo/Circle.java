package com.ue.insw.proyecto.exercises.ej3polimorfismo;


public class Circle extends Shape{
    private double radio;
    static final double PI = 3.141492653589793;
    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radio;
    }

    @Override
    public double calculateArea() {
        return PI*radio*radio;
    }

    @Override
    public String toString() {
        return "El radio del circulo es: " + radio;
    }
}
