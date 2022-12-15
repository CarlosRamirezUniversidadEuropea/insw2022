package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

public class BarbecuePizza extends Pizza {

    public BarbecuePizza(String base, List<String> ingredients, BakeStyle bakeStyle) {
        super("Doble", Arrays.asList("Tomate", "Carne", "Salsa Barbacoa"), bakeStyle);
    }
}
