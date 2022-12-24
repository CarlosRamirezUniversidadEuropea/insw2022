package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main (String[] args){
        Rectangle rectangle=new Rectangle("blue",3,5);

        System.out.println("perimetro: "+ rectangle.calculatePerimeter());
        System.out.println("area: "+ rectangle.calculateArea());
        System.out.println(rectangle);


        Circle circle = new Circle(5,"black");
        System.out.println("perimetro: "+ circle.calculatePerimeter());
        System.out.println("area: "+ circle.calculateArea());
        System.out.println(circle.toString());
        System.out.println(circle);



    }
}
