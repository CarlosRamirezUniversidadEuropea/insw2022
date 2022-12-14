package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String[] args) {
        HawaianPizza pizza = new HawaianPizza(new Calzone());
        pizza.bake();
        pizza = new HawaianPizza(new MuyHecha());
        pizza.bake();
        pizza = new HawaianPizza(new PocoHecha());
        pizza.bake();
        pizza = new HawaianPizza(new HornoLeña());
        pizza.bake();

        CarbonaraPizza pizza1 = new CarbonaraPizza(new Calzone());
        pizza1.bake();
        pizza1 = new CarbonaraPizza(new MuyHecha());
        pizza1.bake();
        pizza1 = new CarbonaraPizza(new PocoHecha());
        pizza1.bake();
        pizza1 = new CarbonaraPizza(new HornoLeña());
        pizza1.bake();

        BarbecuePizza pizza2 = new BarbecuePizza(new Calzone());
        pizza2.bake();
        pizza2 = new BarbecuePizza(new MuyHecha());
        pizza2.bake();
        pizza2 = new BarbecuePizza(new PocoHecha());
        pizza2.bake();
        pizza2 = new BarbecuePizza(new HornoLeña());
        pizza2.bake();
    }
}