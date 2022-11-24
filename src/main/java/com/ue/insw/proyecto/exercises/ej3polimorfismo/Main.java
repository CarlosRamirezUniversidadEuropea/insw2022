package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(4, 2);
        System.out.println("Perimetro: " + r.calculatePerimeter());
        System.out.println("Área: " + r.calculateArea());
        System.out.println(r);

        Circle c = new Circle(4);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Perimetro: " + df.format(c.calculatePerimeter()));
        System.out.println("Área: " + c.calculateArea());
        System.out.println(c);
    }
}
