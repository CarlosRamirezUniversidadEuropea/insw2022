package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private Double ladoLargo;
    private Double ladoCorto;

    public Rectangle(Double ladoLargo, Double ladoCorto) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
    }
    @Override
    public double calculatePerimeter() {
        double resultado = (ladoLargo*2) + (ladoCorto*2);
        return resultado;
    }

    @Override
    public double calculateArea() {
        double resultado = ladoLargo*ladoCorto;
        return resultado;
    }

    @Override
    public String toString() {
        return "Un rectangulo de lado largo: " + ladoLargo + " y de lado corto: " + ladoCorto + "tiene de perimetro: " + calculatePerimeter() + " y de area: " + calculateArea();
    }

    double getLadoLargo() {
        return ladoLargo;
    }

    double getLadoCorto() {
        return ladoCorto;
    }
}
