package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Rectangle w Shape{
    private double base;
    private double altura;
    private String color;
    public Rectangle(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(base + altura);
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "El rectánculo tiene una base:" +  base + "y una altura de " + altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
