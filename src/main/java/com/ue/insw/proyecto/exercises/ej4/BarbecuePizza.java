package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza {
    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Fina", Arrays.asList("Bacon","Salsa barbacoa","Tomate","Queso","Jamón"), bakeStyle);
    }
}
