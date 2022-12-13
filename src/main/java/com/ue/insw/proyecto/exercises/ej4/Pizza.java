package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private int price;
    private String atributoBase;
    private List<String> atributoIngredients;
    private BakeStyle bakeStyle;

    public Pizza(String base, List<String> ingredients, BakeStyle bakeStyle, int price) {
        this.atributoBase = base;
        this.atributoIngredients = ingredients;
        this.bakeStyle = bakeStyle;
        this.price = price;

    }

    public void bake() {

        bakeStyle.bake(this);
    }

    public String toString(){
        return "Pizza{" +
                "price= " + price +
                ", atributoBase=" + atributoBase + '\'' +
                ", atributoIngredientes=" + atributoIngredients +
                ", bakeStyle= " + bakeStyle +
                '}';
    }
}
