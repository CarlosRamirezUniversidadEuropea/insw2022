package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleMore extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println(pizza.toString() + "BakeStyle: Hecha más tostada");
    }
}
