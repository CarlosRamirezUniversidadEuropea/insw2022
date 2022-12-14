package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private int precio;
    private String base;
    private List<String> ingredients;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle, int precio) {
        this.precio= precio;
        this.base=base;
        this.bakeStyle=bakeStyle;
        this.ingredients=ingredients;

    }

    public void bake() {
        bakeStyle.bake(this);
    }

    @Override
    public String toString() {
        return "Pizza{"+
                "Precio: "+precio+
                ", AtributoBase: "+base + '\''+
                ", Ingredientes: "+ingredients +
                ", Tipococinado:"+bakeStyle+
                '}';

    }
}
