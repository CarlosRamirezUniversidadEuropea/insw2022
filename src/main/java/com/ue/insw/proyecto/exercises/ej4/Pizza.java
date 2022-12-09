package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String atributoBase;
    private List<String> atributoIngredients;
    private BakeStyle atributoBakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle){

        this.atributoBase = base;
        this.atributoIngredients = ingredients;
        this.atributoBakeStyle = bakeStyle;
}

    public Pizza(String fina, List<object> asList){
    }

    public void bake(){atributoBakeStyle.bake(this);
    }

    @Override
    public String toString(){
        return "Pizza{" +
                "atrubutoBase =' " + atributoBase + '\'' +
                ", atributoIngredients =" + atributoIngredients +
                ", atributoBakeStyle =" + atributoBakeStyle +
                '}';
    }
}
