package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Rectangle extends Shape{
    double base;
    double altura;
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
        return "Rectangle{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
