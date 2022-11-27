package com.ue.insw.proyecto.exercises.ej3polimorfismo;
public class Rectangle extends Shape{
    private double lado1;
    private double lado2;
    private String color;
    public Rectangle(double lado1, double lado2, String color) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.color=color;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
