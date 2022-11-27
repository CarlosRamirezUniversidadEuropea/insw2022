package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {
    public static void main(String[] args) {
        Circle circulo = new Circle(3.0);
        System.out.println("Un circulo de radio: " + circulo.getRadio() + " tiene de perimetro: " + circulo.calculatePerimeter() + " y de área: " + circulo.calculateArea());

        Rectangle rectangulo = new Rectangle(4.0, 2.0);
        System.out.println("Un rectangulo de lado largo: " + rectangulo.getLadoLargo() + " y de lado corto: " + rectangulo.getLadoCorto() + " tiene de perimetro: " + rectangulo.calculatePerimeter() + " y de area: " + rectangulo.calculateArea());
    }
}
