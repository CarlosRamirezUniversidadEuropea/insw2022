package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class CarbonaraPizza extends Pizza{
    public CarbonaraPizza(BakeStyle bakeStyle) {
        super("Gruesa", Arrays.asList("Salsa tomate", "Queso", "Bacon", "Champiñon", "Cebolla"), bakeStyle);
    }
}