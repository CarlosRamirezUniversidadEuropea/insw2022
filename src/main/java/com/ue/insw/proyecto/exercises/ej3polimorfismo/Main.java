package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 2, "Blanco");
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Color: " + rectangle.getColor());
        rectangle.setColor("Rojo");
        System.out.println(rectangle);

        DecimalFormat df = new DecimalFormat("0.00");
        Circle circle = new Circle(4, "Blanco");
        System.out.println("Perimetro: " + df.format(circle.calculatePerimeter()));
        System.out.println("Area: " + df.format(circle.calculateArea()));
        System.out.println("Color: " + circle.getColor());
        circle.setColor("Rojo");
        System.out.println(circle);

    }
}
