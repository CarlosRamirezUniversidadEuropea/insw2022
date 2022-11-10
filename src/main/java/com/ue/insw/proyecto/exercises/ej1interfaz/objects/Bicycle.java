package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

public class Bicycle extends Vehicle implements Cleanable{
    private BigDecimal price;
    private Color color;
    private BrandBicycle brand;
    public Bicycle(BrandBicycle brand, Color color, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
    }

    public BrandBicycle getBrand() {
        return brand;
    }
    public void setBrand(BrandBicycle brand) {
        this.brand = brand;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }

    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                '}';
    }
}
