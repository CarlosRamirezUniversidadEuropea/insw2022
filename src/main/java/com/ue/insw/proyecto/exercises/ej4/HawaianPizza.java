package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{

    public HawaianPizza(BakeStyleMore bakeStyle) {
        super("Normal", List.of("Piña", "Tomate", "Bacon"), bakeStyle);
    }

}
