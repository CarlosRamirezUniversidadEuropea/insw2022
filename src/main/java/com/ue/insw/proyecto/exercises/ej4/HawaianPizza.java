package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class HawaianPizza extends Pizza {
    public HawaianPizza(TipoCocinado tipoCocinado){
        super("mediana", Arrays.asList("piña","quesos","tomate"),tipoCocinado);

    }
}
