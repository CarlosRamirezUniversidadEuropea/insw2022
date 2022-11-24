package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(4, 2, "Blanco");
        System.out.println("Rectangulo");
        System.out.println("Area rectangulo: " + rectangle.calculateArea());
        System.out.println("Area rectangulo: " + rectangle.calculatePerimeter());

        Circle circulo = new Circle(8,"Blanco");
        System.out.println("Circulo");
        System.out.println("Area: "+ circulo.calculateArea());
        System.out.println("Perimetro: "+ circulo.calculatePerimeter());
    }
}
