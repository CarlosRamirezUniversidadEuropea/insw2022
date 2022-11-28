package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("RECTÁNGULO: ");
        Rectangle rectangle = new Rectangle(4,2);
        System.out.println("Perímetro " + rectangle.calculatePerimeter());
        System.out.println("Área "+ rectangle.calculateArea());
        System.out.println(rectangle);

        System.out.println("");

        System.out.println("CÍRCULO: ");
        Circle circle = new Circle(3);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Área: " + circle.calculateArea());
        System.out.println("Perímetro: " + Math.round(circle.calculatePerimeter()));
        System.out.println(circle);
    }
}
