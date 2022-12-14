package com.ue.insw.proyecto.exercises.ej4;

public class MuyHecha extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Cocinando la pizza " + pizza.toString() + "muy hecha");
    }

    @Override
    public String toString() {
        return "Pizza muy hecha";
    }
}