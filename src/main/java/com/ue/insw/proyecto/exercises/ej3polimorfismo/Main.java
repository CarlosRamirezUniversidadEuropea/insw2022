package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {
    public static void Main (String args[]){
        Rectangle rectangle= new Rectangle(10, 20, "azul");
        System.out.println("Perímetro: "+rectangle.calculatePerimeter());
        System.out.println("Área: "+ rectangle.calculateArea());
        System.out.println(rectangle);

        System.out.println();

        Circle circle= new Circle(10, "azul");
        System.out.println("Perímetro: "+circle.calculatePerimeter());
        System.out.println("Área: "+ circle.calculateArea());
        System.out.println(circle);

        System.out.println("FIN PROGRAMA");
    }
}