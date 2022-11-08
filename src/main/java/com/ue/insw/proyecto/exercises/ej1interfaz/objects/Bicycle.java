package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

public class Bicycle extends Vehicle implements Cleanable {

    private int weight;

    public Bicycle(BigDecimal price, int weight) {
        super(price);
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(){
        this.weight = weight;
    }

    @Override
    public void clean() {

    }
}
