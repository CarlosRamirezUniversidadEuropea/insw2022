package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{

    private String color;

    private double radio;

    private final double pi=3.14;

    public Circle( double radio) {
        this.color="black";
        this.radio = radio;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
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
        return "Este circulo tiene un radio de: "+radio;
    }
}
