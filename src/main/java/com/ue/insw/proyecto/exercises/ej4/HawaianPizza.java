package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class HawaianPizza extends Pizza{
    public HawaianPizza(BakeStyle bakeStyle) {
        super("Gruesa", Arrays.asList("Salsa tomate", "Piña", "Chile verde", "Jamon", "Cebolla"), bakeStyle);
    }
}
