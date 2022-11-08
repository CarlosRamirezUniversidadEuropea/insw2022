package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;

import java.math.BigDecimal;

public class Vehicle {

    private BigDecimal price;
    private int speed;

    public Vehicle(BigDecimal price) {
        this.price = price;
    }

    public Vehicle(BrandBicycle brand, Color color, BigDecimal price) {
    }

    public BigDecimal getPrice(){
        return price;
    }
}
