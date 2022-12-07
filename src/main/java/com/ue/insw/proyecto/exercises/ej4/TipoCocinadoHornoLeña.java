package com.ue.insw.proyecto.exercises.ej4;

public class TipoCocinadoHornoLeña extends TipoCocinado {

    @Override

    public void cocinar(Pizza pizza){
        System.out.println("Cocinando la pizza"+ pizza.toString()+"con hoorno a leña"+ "a un tiempo aproximadamente de 50  min");
    }
}
