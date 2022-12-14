package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private int precio;
    private String atributoBase;
    private List<String> atributoIngredients;
    //private BakeStyle bakeStyle;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle, int precio) {
    this.atributoBase = base;
    this.atributoIngredients = ingredients;
    this.bakeStyle = bakeStyle;
    this.precio = precio;
    }

    public void bake() {
        bakeStyle.bake(this);
    }

    public String toString() {
        return "Pizza{" +
                "precio= " + precio +
                ", atributoBase= " + atributoBase +
                ", atributoIngredients= " + atributoIngredients +
                ", tipoCocinado= " + bakeStyle +
                "}";
    }
}
