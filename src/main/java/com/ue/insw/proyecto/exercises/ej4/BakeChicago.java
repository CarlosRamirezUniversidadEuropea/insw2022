package com.ue.insw.proyecto.exercises.ej4;

public class BakeChicago extends BakeStyle {
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Preparación estilo chicago: " + pizza.toString());
    }
}
