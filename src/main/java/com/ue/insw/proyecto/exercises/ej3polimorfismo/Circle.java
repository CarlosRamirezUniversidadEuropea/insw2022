package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private String color ;

    private int lado1Largo;

    private int lado1Corto;

    public abstract double calculetPerimeter;

    public abstract double calculetArea;




    public Rectangle (String color, int lado1Largo, int lado1Corto){
        this.color=color;
        this.lado1Largo=lado1Largo;
        this.lado1Corto=lado1Corto;


    }

    public String getColor(){
        return Color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getLado1Largo(){
        return lado1Largo;
    }

    public void setLado1Largo(int lado1Largo) {
        this.lado1Largo = lado1Largo;
    }

    public int getLado1Corto() {
        return lado1Corto;
    }

    public void setLado1Corto(int lado1Corto) {
        this.lado1Corto = lado1Corto;
    }

    public double getCalculetPerimeter() {
        return lado1Largo * 2 + lado1Corto * 2 ;
    }

    public void setCalculetPerimeter(double calculetPerimeter) {
        this.calculetPerimeter = calculetPerimeter;
    }

    public void setCalculetArea(double calculetArea) {
        this.calculetArea = calculetArea;
    }

    public double getCalculetArea() {
        return lado1Corto * lado1Largo;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color
        "ladoLargo= " lado1Largo
        "ladoCorto=" + lado1Corto
        "calculetPerimeter=" + calculetPerimeter
        "caluletArea= " + calculetArea
        "}";
    }


}

}
