package com.ue.insw.proyecto.exercises.ej4;

public class Calzone extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Cocinando la pizza " + pizza.toString() + "al estilo Calzone");
    }

    @Override
    public String toString() {
        return "Calzone";
    }
}