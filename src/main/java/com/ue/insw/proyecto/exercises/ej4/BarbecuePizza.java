package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(TipoCocinado tipoCocinado){
        super("extra grande", Arrays.asList("carne","tomate","cebolla"),tipoCocinado);

    }
}
