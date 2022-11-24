package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{

    private double radio;
    private final double pi = 3.1416;
    private String color;

    public Circle(double radio, String color){
        this.radio = radio;
        this.color = color;
    }
    @Override
    public double calculatePerimeter() {
        return 2*pi*radio;
    }

    @Override
    public double calculateArea() {
        return pi*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", pi=" + pi +
                ", color='" + color + '\'' +
                '}';
    }
}
