package com.ue.insw.proyecto.exercises.ej4;

public class Calzone extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza estilo calzone" + pizza.toString());
    }

    @Override
    public String toString() {
        return "Calzone";
    }
}
