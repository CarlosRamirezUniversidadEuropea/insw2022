package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[]args) {
        Circle circle1 = new Circle(2);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.println("El area es: " +circle1.calculateArea()+ "\n El perimetro es: " +circle1.calculatePerimeter());
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(5, 3);
        System.out.println("El area es: " + rectangle1.calculateArea()+ "\n El perimetro es: " +rectangle1.calculatePerimeter());
        System.out.println(rectangle1);
    }
}
