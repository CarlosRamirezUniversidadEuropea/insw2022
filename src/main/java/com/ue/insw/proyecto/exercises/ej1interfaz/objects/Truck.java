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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TrukBrand getType() {
        return type;
    }

    public void setType(TrukBrand type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return "Truck{" +
                "brand=" + type +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void clean() {
        System.out.println("Truck limpiándose.");
    }
}
