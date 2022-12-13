package com.ue.insw.proyecto.exercises.ej4;

public class PocoHecha extends BakeStyle{

    @Override
    public void bake(Pizza pizza) {
        System.out.println(pizza.toString() + "se está cocinando en el horno de manera poco hecha");
    }
}
