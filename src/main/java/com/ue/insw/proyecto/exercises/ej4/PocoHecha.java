package com.ue.insw.proyecto.exercises.ej4;

public class PocoHecha extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza Jugosa poca hecha" + pizza.toString());
    }

    @Override
    public String toString() {
        return "PocoHecha";
    }
}
