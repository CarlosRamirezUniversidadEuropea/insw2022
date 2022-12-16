package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

public class BarbecuePizza extends Pizza {

    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Doble", Arrays.asList("Tomate", "Carne", "Salsa Barbacoa"), bakeStyle);
    }
}
