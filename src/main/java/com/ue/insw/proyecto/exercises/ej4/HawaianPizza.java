package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class HawaianPizza extends Pizza{

    public HawaianPizza(MuyHecha bakeStyle){
        super("Normal", Arrays.asList("Tomate", "Piña", "Jamón"), bakeStyle, 12);
    }
}
