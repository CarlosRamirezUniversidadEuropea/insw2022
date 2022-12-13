package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {
    private String nombre;
    private String base;
    private List<String> ingredients;
    private BakeStyle bakeStyle;

    public Pizza(String nombre, String base, List<String> ingredients, BakeStyle bakeStyle) {
        this.nombre = nombre;
        this.base = base;
        this.ingredients = ingredients;
        this.bakeStyle = bakeStyle;
    }

    public void bake() {
        bakeStyle.bake(this);
    }

    public String toString(){
        return nombre+ "\nBase: " +base+ "\nIngredientes: " +ingredients+ "\nCocinado: " +bakeStyle+ "\n";
    }
}
