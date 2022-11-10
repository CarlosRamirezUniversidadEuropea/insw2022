package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BicyBrand;

public class Bicycle extends Vehicle implements Cleanable {

    private int peso;
    private BicyBrand type;
    private Color color;
    public int getPeso() {
        return peso;
    }

    public BicyBrand getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }


    public Bicycle(BigDecimal price, int peso, BicyBrand type, Color color){
        super (price);
        this.peso=peso;
        this.type=type;
        this.color = color;
    }

    @Override
    public void clean() {
        System.out.println("Limpiándose la bici");
    }

    @Override
    public String toString() {
        return "Bicileta{" +
                "brand=" + type +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }

}
