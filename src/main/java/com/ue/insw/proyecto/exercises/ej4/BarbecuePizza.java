package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(String nombre, String base, List<String> ingredients, BakeStyle bakeStyle) {
        super(nombre, base, ingredients, bakeStyle);
    }
}
