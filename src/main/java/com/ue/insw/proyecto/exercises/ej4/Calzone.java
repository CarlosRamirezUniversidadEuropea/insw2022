package com.ue.insw.proyecto.exercises.ej4;

public class Calzone extends BakeStyle{

    @Override
    public void bake(Pizza pizza) {
        System.out.println(pizza.toString() + " se está cocinando de manera calzone");
    }
}
