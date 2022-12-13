package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

public class Pizza {

    private String basePizza;
    private List<String> ingredientes;
    private BakeStyle formaDeCocinar;
    private int precio;
    private String tipo;

    public Pizza(String base, List<String> ingredients, int price, String type) {
        this.basePizza = base;
        this.ingredientes = ingredients;
        this.precio = price;
        this.tipo = type;
    }
    public void bake() {
        formaDeCocinar.bake(this);
    }

    public String datosPizza() {
        return "[Datos de la pizza]" +
                "\n Tipo: " + tipo +
                "\n Base: " + basePizza +
                "\n Ingredientes: " + ingredientes +
                "\n Precio: " + precio;
    }
}
