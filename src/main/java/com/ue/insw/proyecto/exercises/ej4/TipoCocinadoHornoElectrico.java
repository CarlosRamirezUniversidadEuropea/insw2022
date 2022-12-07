package com.ue.insw.proyecto.exercises.ej4;

public class TipoCocinadoHornoElectrico extends TipoCocinado{

    @Override

    public void cocinar(Pizza pizza){
        System.out.println("Cocinando la pizza "+ pizza.toString()+ "cpon hotno a electrico"+ "a un tiempor aproximadamente de 30 min");
    }


}
