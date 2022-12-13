package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoLeña extends BakeStyle{
    public void bake(Pizza pizza){
        System.out.println("Preparando la pizza" + pizza.toString() +
                "Con horno Leña" +
                "Tiempo: 35min" );
    }
}
