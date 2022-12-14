package com.ue.insw.proyecto.exercises.ej4;

public class PocoHecha extends BakeStyle {

    @Override
    public void bake (Pizza pizza) {
        System.out.println("Cocinando la pizza" + pizza.toString() + " de forma muy hecha");
    }
}
