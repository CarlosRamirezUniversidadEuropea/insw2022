package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    private double lado1;
    private double lado2;
    private String color;

    public Rectangle(String color, double lado1Const, double lado2Const){
        this.color = color;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangle(double lado1Const, double lado2Const){
        this.color = "White";
        this.lado1 = lado1Const;
        this.lado2 = lado2Const;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calculatePerimeter(){
        return 2*(lado1 + lado2);
    }
    public double calculateArea(){
        return lado1*lado2;
    }
    public String toString(){
        String sRet = "Este rectangulo tiene de lado 1 " + lado1 + " y de lado 2 " + lado2;
        return sRet;
    }


}
