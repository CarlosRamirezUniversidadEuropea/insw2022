package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Con queso los bordes", Arrays.asList("Carne", "Salsa Barbacoa", "Maiz", "Cebolla"), bakeStyle);
    }
}
