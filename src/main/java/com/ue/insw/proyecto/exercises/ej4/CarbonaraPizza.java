package com.ue.insw.proyecto.exercises.ej4;
import java.util.Arrays;

//todo extends pizza
public class CarbonaraPizza extends Pizza {
    public CarbonaraPizza(TipoCocinado tipoCocinado){
        super("norml", Arrays.asList("tomate","mozarrella","champinon","cebolla"),tipoCocinado);
    }

}
