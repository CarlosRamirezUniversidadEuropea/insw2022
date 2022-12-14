package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza {

    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Fina", Arrays.asList("Salsa de tomate", "BBQ", "Jamón", "Queso", "Pollo"), bakeStyle);
    }
}

