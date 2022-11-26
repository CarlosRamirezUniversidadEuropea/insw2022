package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,2);

        System.out.println("Perimetro: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println(rectangle);

        Circle circle = new Circle(3);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Area: " + df.format(circle.calculateArea()));
        System.out.println("Perimetro: " + df.format(circle.calculatePerimeter()));

    }
}