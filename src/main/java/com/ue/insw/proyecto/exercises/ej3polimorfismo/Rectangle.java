package com.ue.insw.proyecto.exercises.ej3polimorfismo;


//todo extends shape
public class Rectangle extends Shape {

    private double lado1;
    private double lado2;
    private String color;

    public Rectangle(double lado1, double lado2, String color) {
        this.color=color;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangle(double lado1, double lado2) {
        this.color="white";
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(lado1+lado2);
    }

    @Override
    public double calculateArea() {
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return "Este rectángulo tiene una base de " + lado1 + " y una altura de " + lado2;
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
}
