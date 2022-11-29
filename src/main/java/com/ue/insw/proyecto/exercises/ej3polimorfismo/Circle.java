package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {

    private double radio;

    private final double pi = 3.1415926535;

    public Circle(double radio, String color) {
        super(color);
        this.radio = radio;
    }


    @Override

    public double calculatePerimeter() {
        return 2 * pi * radio;
    }

    @Override

    public double calculateArea() {
        return pi * (radio * radio);
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public String toString() {
        return "El circulo tiene un radio de : " + radio;
    }


}


