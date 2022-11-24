package com.ue.insw.proyecto.exercises.ej3polimorfismo;
import java.lang.Math.*;

public class Circle extends Shape{
    private double radio;
    private String color;

    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radio * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "El círculo tiene un radio de " + radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
