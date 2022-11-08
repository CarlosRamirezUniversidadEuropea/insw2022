package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

public class Truck extends Vehicle implements Cleanable {

    int wheels;
    public Truck(BigDecimal price, int wheels) {
        super(price);
        this.wheels = wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public int getWheels(int wheels){
        return this.wheels;
    }

    @Override
    public void clean() {

    }
}
