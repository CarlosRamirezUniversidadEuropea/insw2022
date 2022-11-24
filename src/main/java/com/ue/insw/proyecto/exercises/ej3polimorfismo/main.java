package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class main {
    public static void main (String args[]){
        Rectangle rectangle= new Rectangle(10, 20, "azul");
        System.out.println("Perímetro: "+rectangle.calculatePerimeter());
        System.out.println("Área: "+ rectangle.calculateArea());
        System.out.println(rectangle);

        System.out.println();

        Circle circle= new Circle(10, "azul");
        System.out.println("Perímetro: "+circle.calculatePerimeter());
        System.out.println("Área: "+ circle.calculateArea());
        System.out.println(circle);

        System.out.println();

        System.out.println("FIN PROGRAMA");
    }
}
