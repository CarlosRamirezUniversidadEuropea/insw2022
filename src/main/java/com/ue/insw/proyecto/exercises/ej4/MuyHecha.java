package com.ue.insw.proyecto.exercises.ej4;

public class MuyHecha extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza muy hecha" + pizza.toString());
    }

    @Override
    public String toString() {
        return "MuyHecha";
    }
}
