package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Rectangle rectangle = new Rectangle(5, 3.57, "Blanco");
        System.out.println("Perimetro: " + df.format(rectangle.calculatePerimeter()));
        System.out.println("Area: " + df.format(rectangle.calculateArea()));
        System.out.println("Color: " + rectangle.getColor());
        rectangle.setColor("Rojo");
        System.out.println(rectangle);

        Circle circle = new Circle(4, "Blanco");
        System.out.println("Perimetro: " + df.format(circle.calculatePerimeter()));
        System.out.println("Area: " + df.format(circle.calculateArea()));
        System.out.println("Color: " + circle.getColor());
        circle.setColor("Rojo");
        System.out.println(circle);

    }
}
