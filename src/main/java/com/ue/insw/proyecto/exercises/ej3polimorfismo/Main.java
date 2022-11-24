package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle("Verde", 4, 2);
        Circle circle = new Circle("Azul", 5);

        System.out.println("Perimetro Rectangulo: " +rectangle.calculatePerimeter());
        System.out.println("Área Rectangulo: " +rectangle.calculateArea());
        System.out.println(rectangle);

        System.out.println("Perimetro Circulo: " +circle.calculatePerimeter());
        System.out.println("Área Circulo: " +circle.calculateArea());
        System.out.println(circle);
    }
}
