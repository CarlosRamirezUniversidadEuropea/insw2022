package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza{

    private BakeStyle bakeStyle;

    public BarbecuePizza(BakeStyle bakeStyle) {
        super("Normal", List.of("Salsa Barbacoa", "Tomate", "Bacon"), bakeStyle);
    }

    public void bake(){ bakeStyle.bake(this); }

}
