package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

public class CarbonaraPizza extends Pizza {

    public CarbonaraPizza(String base, List<String> ingredients, BakeStyle bakeStyle) {
        super("fina", Arrays.asList("Tomate", "Cebolla", "Champiñión"), bakeStyle);
    }
}
