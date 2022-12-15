package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;
import java.util.Arrays;

public class HawaianPizza extends Pizza {

    public HawaianPizza(String base, List<String> ingredients, BakeStyle bakeStyle) {
        super("gruesa", Arrays.asList("Tomate", "Piña", "Jamón"), bakeStyle);
    }
}
