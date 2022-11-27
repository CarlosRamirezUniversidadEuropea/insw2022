package com.ue.insw.proyecto.exercises.ej3polimorfismo;



//todo extends shape
public class Rectangle extends Shape {
    private String color ;

    private int ladoLargo;

    private int ladoCorto;

    public abstract double calculetPerimeter;

    public abstract double calculetArea;




    public Rectangle (String color, int ladoLargo, int ladoCorto){
        this.color=color;
        this.ladoLargo=ladoLargo;
        this.ladoCorto=ladoCorto;


    }

    public String getColor(){
        return Color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getLadoLargo(){
        return ladoLargo;
    }

    public void setLadoLargo(int ladoLargo) {
        this.ladoLargo = ladoLargo;
    }

    public int getLadoCorto() {
        return ladoCorto;
    }

    public void setLadoCorto(int ladoCorto) {
        this.ladoCorto = ladoCorto;
    }

    public double getCalculetPerimeter() {
        return ladoLargo * 2 + ladoCorto * 2 ;
    }

    public void setCalculetPerimeter(double calculetPerimeter) {
        this.calculetPerimeter = calculetPerimeter;
    }

    public void setCalculetArea(double calculetArea) {
        this.calculetArea = calculetArea;
    }

    public double getCalculetArea() {
        return ladoCorto * ladoLargo;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color
                "ladoLargo= " ladoLargo
                "ladoCorto=" + ladoCorto
                "calculetPerimeter=" + calculetPerimeter
                "caluletArea= " + calculetArea
                "}";
    }


}
