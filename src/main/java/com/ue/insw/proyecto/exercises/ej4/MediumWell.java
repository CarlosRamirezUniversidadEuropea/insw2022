package com.ue.insw.proyecto.exercises.ej4;

public class MediumWell extends BakeStyle {
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza en su punto" + pizza.toString());
    }

    @Override
    public String toString() {
        return "En su punto";
    }
}
