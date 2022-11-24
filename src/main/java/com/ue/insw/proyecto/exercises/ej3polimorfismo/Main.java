package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(4,2,"rojo");
        System.out.println("El perímetro es: " + rectangle.calculatePerimeter());
        System.out.println("El área es: " + rectangle.calculateArea());
        System.out.println(rectangle);

        Circle circle = new Circle(2, "verde");
        System.out.println("El círculo tiene un perímetro de " + circle.calculatePerimeter());
        System.out.println("El circulo tiene un área de " + circle.calculateArea());
        System.out.println(circle);
    }
}
