package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String atributosBase;
    private List<String> atributosIngredients;
    private BakeStyle atributosBakeStyle;

    public Pizza(String base, List<String> ingredients,BakeStyle bakestyle) {
     this.atributosBase=base;
     this.atributosIngredients=ingredients;
     this.atributosBakeStyle=bakestyle;
    }

    public void bake() {
        atributosBakeStyle.bake(this);
    }
}
