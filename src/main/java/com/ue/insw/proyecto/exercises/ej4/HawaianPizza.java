package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{
    public HawaianPizza(BakeStyle bakeStyle) {
        super("Clásica", Arrays.asList("Piña","Queso","Jamón","Cebolla"),bakeStyle);
    }
}
