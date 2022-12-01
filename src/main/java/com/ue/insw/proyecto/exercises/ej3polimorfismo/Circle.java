package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circulo extends Shape{
    private double radio
    private double PI= 3.1416;

    public Circulo(double radio, double PI) {
        this.radio = radio;
        this.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
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
        return "Circle{" +
                "radio=" + radio +
                ", pi=" + PI +
                '}' }

    }
