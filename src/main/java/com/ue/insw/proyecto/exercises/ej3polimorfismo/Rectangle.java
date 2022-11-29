package com.ue.insw.proyecto.exercises.ej3polimorfismo;



//todo extends shape
public class Rectangle extends Shape {

    private int ladoLargo;

    private int ladoCorto;

    public Rectangle (String color, int ladoLargo, int ladoCorto){
        super(color);
        this.ladoLargo=ladoLargo;
        this.ladoCorto=ladoCorto;


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

    public double calculatePerimeter() {
        return 2*(ladoCorto+ladoLargo);
    }

    public double calculateArea() {
        return ladoCorto * ladoLargo   ;
    }

    @Override
    public String toString() {
        return ("Este rectang tienee una base de " + ladoLargo+ "y una altura de "+ ladoCorto);
    }



}
