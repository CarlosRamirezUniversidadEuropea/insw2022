package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String base;
    private List<String> ingredients;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle) {

    }

    public void bake() {
        bakeStyle.bake(this);
    }
}
