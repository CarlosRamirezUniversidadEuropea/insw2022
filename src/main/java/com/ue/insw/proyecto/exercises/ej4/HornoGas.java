package com.ue.insw.proyecto.exercises.ej4;

public class HornoGas extends BakeStyle {
    @Override
    public void bake(Pizza pizza) {
        System.out.println(pizza.datosPizza() + "\n Tipo de horno: de gas");
    }
}
