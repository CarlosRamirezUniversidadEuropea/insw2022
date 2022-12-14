package com.ue.insw.proyecto.exercises.ej4;

public class WellDone extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza muy hecha" + pizza.toString());
    }

    @Override
    public String toString() {
        return "Muy hecha";
    }
}
