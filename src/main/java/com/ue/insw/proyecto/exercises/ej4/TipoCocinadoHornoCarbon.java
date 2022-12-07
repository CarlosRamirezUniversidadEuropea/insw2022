package com.ue.insw.proyecto.exercises.ej4;

public class TipoCocinadoHornoCarbon extends TipoCocinado {

    @Override

    public void cocinar(Pizza pizza){
        System.out.println("Cocinando la pizza"+ pizza.toString()+ "con horno a carbon "+ "a un tiempo aproximadamente a 60 min ");

    }



}
