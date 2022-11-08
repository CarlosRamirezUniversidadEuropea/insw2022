package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BicyBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.TrukBrand;

public class Truck extends Vehicle implements Cleanable {

    private int peso;
    private TrukBrand type;
    private Color color;
    public Truck(BigDecimal price, int peso, TrukBrand type, Color color) {
        super(price);
        this.peso=peso;
        this.type=type;
        this.color=color;
    }

    @Override
    public void clean() {

    }
}
