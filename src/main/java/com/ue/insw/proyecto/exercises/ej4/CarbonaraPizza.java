package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class CarbonaraPizza extends Pizza{

    public CarbonaraPizza(BakeStyle bakeStyle) {
        super("Fina", List.of("Salsa Carbonara", "Tomate", "Bacon"), bakeStyle);
    }
}
