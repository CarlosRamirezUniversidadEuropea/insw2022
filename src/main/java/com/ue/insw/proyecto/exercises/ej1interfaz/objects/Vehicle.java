package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

public class Vehicle {

    BigDecimal price;
    private int speed;


    public Vehicle(BigDecimal price) {

        this.price = price;
    }

    public BigDecimal getPrice(){

        return price;
    }
}
