package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{
    private BakeStyle bakeStyle;

    public HawaianPizza(BakeStyleMore bakeStyle) {
        super("Normal", List.of("Piña", "Tomate", "Bacon"), bakeStyle);
    }

    public void bake(){ bakeStyle.bake(this);}
}
