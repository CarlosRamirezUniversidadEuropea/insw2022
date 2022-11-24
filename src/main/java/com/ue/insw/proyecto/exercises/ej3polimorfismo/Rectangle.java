package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    private double B;
    private double H;
    private String color;

    public Rectangle(double B, double H, String color) {
        this.B=B;
        this.H=H;
        this.color=color;
    }

    @Override
    public double calculateArea() {
        return B*H;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(B+H);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + B +
                ", altura=" + H +
                '}';
    }

    public double getBase() {
        return B;
    }
    public double getAltura() {
        return H;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setB(double b) {
        B = b;
    }

    public void setH(double h) {
        H = h;
    }

    public void setBase(double base) {
        this.B = base;
    }
}