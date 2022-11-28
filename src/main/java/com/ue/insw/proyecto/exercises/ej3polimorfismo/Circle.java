package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {

    private double radio;
    static final double pi = 3.141592653589793;

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
        return 2*(pi*radio);
    }

    @Override
    public double calculateArea() {
        return pi*(radio*radio);
    }

    @Override
    public String toString() {
        return "Este circulo tiene un radio de " + radio;
    }
}
