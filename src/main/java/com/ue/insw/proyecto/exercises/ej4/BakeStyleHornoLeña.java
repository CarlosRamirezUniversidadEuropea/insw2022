package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoLeña extends BakeStyle{
    @Override
    public void bake(Pizza pizza){
        System.out.println("Cocinando la pizza"+pizza.toString()+
                "con horno de leña"+
                "a un tiempo de 30 min");
    }
}
