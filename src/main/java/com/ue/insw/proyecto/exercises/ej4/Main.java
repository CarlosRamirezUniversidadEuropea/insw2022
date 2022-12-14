package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String[] args) {
        HawaianPizza pizza = new HawaianPizza(new MediumWell());
        pizza.bake();
        pizza = new HawaianPizza(new WellDone());
        pizza.bake();
        pizza = new HawaianPizza(new WellDone());
        pizza.bake();
        CarbonaraPizza pizza1 = new CarbonaraPizza(new MediumWell());
        pizza1.bake();
        pizza1 = new CarbonaraPizza(new WellDone());
        pizza1.bake();
    }
}
