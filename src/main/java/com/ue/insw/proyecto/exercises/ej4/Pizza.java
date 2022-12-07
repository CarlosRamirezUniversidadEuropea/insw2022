package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String base;
    private List<String> ingredients;
    private TipoCocinado tipoCocinado;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, TipoCocinado tipoCocinado) {
        this.base=base;
        this.ingredients=ingredients;
        this.tipoCocinado=tipoCocinado;

    }

    public void bake() {
        bakeStyle.bake(this);
    }


    public void cocinar() {
        tipoCocinado.cocinar(this);

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "base='" + base  +
                ", ingredients=" + ingredients +
                ", tipoCocinado=" + tipoCocinado +
                ", bakeStyle=" + bakeStyle +
                '}';
    }
}

