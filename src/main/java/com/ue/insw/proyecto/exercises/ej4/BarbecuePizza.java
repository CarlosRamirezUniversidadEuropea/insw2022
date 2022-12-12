package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Delgada", Arrays.asList("Salsa tomate", "BBQ", "Pepperonni", "Jamon", "Cebolla"), bakeStyle);
    }
}
