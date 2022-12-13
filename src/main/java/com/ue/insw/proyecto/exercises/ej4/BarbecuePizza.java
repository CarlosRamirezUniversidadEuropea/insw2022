package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{
    public BarbecuePizza(BakeStyle bakeStyle) {

        super("Gruesa", List.of("jamon","champiñones","queso","cebolla"), bakeStyle);

    }


}
