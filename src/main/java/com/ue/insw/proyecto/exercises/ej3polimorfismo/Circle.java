package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends  Shape{
    private double R;
    private String color;
    public Circle(double R,String color) {
        this.R = R;
        this.color = color;
    }
    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * R ;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(R,2) ;
    }

    @Override
    public String toString() {
        return "Circle{" + "radio= " + R + '}';
    }
    public double getRadio() {
        return R;
    }

    public String getColor() {
        return color;
    }
}
