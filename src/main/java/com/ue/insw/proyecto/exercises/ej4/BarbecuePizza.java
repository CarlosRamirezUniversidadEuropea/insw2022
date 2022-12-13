package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

public class BarbecuePizza extends Pizza{
    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Normal", Arrays.asList("Salsa tomate", "Salsa Barbacoa", "Maiz", "Pollo", "Cebolla"), bakeStyle);
    }
}
