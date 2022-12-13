package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHorno extends BakeStyle{
    @Override
    public void bake(Pizza pizza) {
        System.out.println("Pizza: \n" + pizza.toString() + "\n Hecha en horno normal");
    }
}
