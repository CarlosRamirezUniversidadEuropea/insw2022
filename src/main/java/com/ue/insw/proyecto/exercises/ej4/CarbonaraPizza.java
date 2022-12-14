package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class CarbonaraPizza extends Pizza {

    public CarbonaraPizza(BakeStyle bakeStyle) {
        super("Normal", Arrays.asList("Salsa de tomate", "Queso", "Jamón", "Champiñón"), bakeStyle);
    }

}

