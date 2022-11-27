package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private double radio;
    final double pi = 3.14;
    public Circle(double radio) {
        this.radio = radio;
    }
    @Override
    public double calculatePerimeter() {
        double resultado = 2*pi*radio;
        return resultado;
    }

    @Override
    public double calculateArea() {
        double resultado = pi*radio*radio;
        return resultado;
    }

    @Override
    public String toString() {
        return "Un circulo de radio: " + radio + " tiene de perimetro: " + calculatePerimeter() + " y de área: " + calculateArea();
    }

    public double getRadio() {
        return radio;
    }
}
