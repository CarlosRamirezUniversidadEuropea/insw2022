package com.ue.insw.proyecto.exercises.ej4;


import java.util.Arrays;
import java.util.List;

public class CarbonaraPizza extends Pizza{

    public CarbonaraPizza(BakeStyle bakeStyle) {
        super("Clasica", Arrays.asList("Jamon", "Champiñones", "Cebolla"), bakeStyle);
    }
}
