package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle  extends Shape{

    private int lado1;
    private int lado2;
    private String color;

    public Rectangle(int lado1,int lado2, String color) {
        this.color = color;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangle(int lado1,int lado2) {
        this.color = "white";
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (lado1 + lado2);
    }

    /**
     * @return
     */
    @Override
    public double calculateArea() {
        return lado1 * lado2;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Este rectangulo tiene una base de " + lado1 + "  y una altura de " + lado2;
    }
}
