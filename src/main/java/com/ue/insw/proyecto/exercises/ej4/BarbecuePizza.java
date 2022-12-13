package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Normal", List.of("Salsa Barbacoa", "Tomate", "Bacon"), bakeStyle);
    }
}
