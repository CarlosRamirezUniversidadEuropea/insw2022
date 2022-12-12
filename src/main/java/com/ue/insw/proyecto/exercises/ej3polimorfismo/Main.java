package com.ue.insw.proyecto.exercises.ej3polimorfismo;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        Rectangle rectangle = new Rectangle("Verde", 4, 2);
        Circle circle = new Circle("Azul", 5);

        System.out.println("Perimetro Rectangulo: " +df.format(rectangle.calculatePerimeter()));
        System.out.println("Área Rectangulo: " +df.format(rectangle.calculateArea()));
        System.out.println(rectangle);

        System.out.println("");

        System.out.println("Perimetro Circulo: " +df.format(circle.calculatePerimeter()));
        System.out.println("Área Circulo: " +df.format(circle.calculateArea()));
        System.out.println(circle);
    }
}
