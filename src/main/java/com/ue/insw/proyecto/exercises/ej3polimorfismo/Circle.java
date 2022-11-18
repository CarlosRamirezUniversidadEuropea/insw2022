package com.ue.insw.proyecto.exercises.ej3polimorfismo;
import java.lang.Math.*;

public class Circle extends Shape{
    double radio;
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
        return "Circle{" +
                "radio=" + radio +
                '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
