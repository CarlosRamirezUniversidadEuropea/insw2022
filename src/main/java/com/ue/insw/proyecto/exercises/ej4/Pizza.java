package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String atribBase;
    private List<String> atribIngredients;
    private BakeStyle atribBakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle) {
        this.atribBase=base;
        this.atribIngredients=ingredients;
        this.atribBakeStyle=bakeStyle;
    }

    public void bake() {
        atribBakeStyle.bake(this);
    }
}
