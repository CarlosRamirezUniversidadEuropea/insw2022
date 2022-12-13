package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String args[]){
        HawaianPizza h = new HawaianPizza(new BakeStyleMore());
        CarbonaraPizza c = new CarbonaraPizza(new BakeStyleHorno());
        BarbecuePizza b = new BarbecuePizza(new BakeStyleHorno());

        System.out.println(h);
        System.out.println(b);
        System.out.println(c);
    }
}
