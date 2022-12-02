package com.ue.insw.proyecto.exercises.ej4;

public class BakeCalzone extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Preparación cerrada(Calzone): " + pizza.toString());
    }
}
