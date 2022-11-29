package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main (String[] args){
        Rectangle rectangle=new Rectangle("blue",3,5);

        System.out.println("perimetro: "+ rectangle.calculatePerimeter());
        System.out.println("area: "+ rectangle.calculateArea());
        System.out.println(rectangle);


    }
}
