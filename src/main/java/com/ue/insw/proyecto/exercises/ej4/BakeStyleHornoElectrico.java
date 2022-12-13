package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoElectrico extends BakeStyle {
    public void bake(Pizza pizza){
        System.out.println("Preparando la pizza" + pizza.toString() +
                "Con horno electrico" +
                "Tiempo: 20min" );
    }
}
