package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double lado1;

    private double lado2;

    private String color;

    public Rectangle(double lado1, double lado2, String color) {
        this.color=color;
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public Rectangle(double lado1, double lado2) {
        this.color="white";
        this.lado1=lado1;
        this.lado2=lado2;
    }


    @Override
    public double calculatePerimeter() {
        return (lado1*2)+(lado2*2);
    }

    @Override
    public double calculateArea() {
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return "El Rectangulo tiene un lado de "+ lado1 +" y otro lado de "+ lado2;
    }

}
