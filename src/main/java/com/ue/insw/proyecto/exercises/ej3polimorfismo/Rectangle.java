package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{

    private double altura;
    private double base;
    private String color;

    public Rectangle(double altura, double base, String color){
        this.altura = altura;
        this.base = base;
        this.color = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(altura + base);
    }

    @Override
    public double calculateArea() {
        return base*altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
