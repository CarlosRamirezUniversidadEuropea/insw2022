package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());


        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}
