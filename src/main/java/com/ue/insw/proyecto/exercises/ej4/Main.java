package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String[] args) {
        BarbecuePizza pizzaBarbacoa = new BarbecuePizza(new MuyHecha());
        CarbonaraPizza pizzaCarbonara = new CarbonaraPizza(new PocoHecha());
        HawaianPizza pizzaHawaiana = new HawaianPizza(new Calzone());

        pizzaBarbacoa.bake();
        pizzaCarbonara.bake();
        pizzaHawaiana.bake();
    }
}
