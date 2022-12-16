package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {
    private String name;
    private String base;
    private List<String> ingredients;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle) {
        this.base=base;
        this.ingredients=ingredients;
        this.bakeStyle=bakeStyle;
    }

    public void bake() {
        bakeStyle.bake(this);
    }

    public String toString(){
        return name+ "\nBase: " +base+ "\nIngredientes: " +ingredients+ "\nTipo de cocinado: " +bakeStyle+ "\n";
    }
}
