package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {
    public static void main(String args[]){

        Rectangle rectangulo = new Rectangle(6,7,"negro");
        System.out.println("Perimetro: " + rectangulo.calculatePerimeter());
        System.out.println("Area: " + rectangulo.calculateArea());
        System.out.println("Color: "+ rectangulo.getColor());
        System.out.println(rectangulo);

        System.out.println("");

        Circle circulo = new Circle(4, "morado");
        System.out.println("Perimetro: " + circulo.calculatePerimeter());
        System.out.println("Area: " + circulo.calculateArea());
        System.out.println("Color: "+ circulo.getColor());
        System.out.println(circulo);
    }
}