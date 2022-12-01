package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import java.text.DecimalFormat;
import java.util.PrimitiveIterator;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Rectangulo rectangulo = new Rectangulo(10.56, 6.67);
        System.out.println("Perimetro del Rectangulo: " + df.format(rectangulo.calculatePerimeter()));
        System.out.println("Area del Rectangulo: " + df.format(rectangulo.calculateArea()));
        System.out.println(rectangulo);

        Circulo circulo = new Cirulo(7.98);
        System.out.println("Perimetro del Circulo: " + df.format(circulo.calculatePerimeter()));
        System.out.println("Area del Circulo: " + df.format(circulo.calculateArea()));
        System.out.println(circulo);

    }
}