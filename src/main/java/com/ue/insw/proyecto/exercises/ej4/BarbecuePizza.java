package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class BarbecuePizza extends Pizza{

    public BarbecuePizza (BakeStyle bakeStyle) {
        super("Normal", Arrays.asList("Tomate", "Mozzarella", "Champiñon", "Cebolla"), bakeStyle, 10);
    }
}
