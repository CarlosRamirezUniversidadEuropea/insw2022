package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

public class HawaianPizza extends Pizza {
    public HawaianPizza(BakeStyle bakeStyle) {
        super("gruesa", Arrays.asList("Tomate", "Piña", "Jamón"), bakeStyle);
    }
}
