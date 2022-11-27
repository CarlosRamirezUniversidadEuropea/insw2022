package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;
public class Truck extends Vehicle implements Cleanable {
    public Truck(BigDecimal price) {
        super(price);
    }

    @Override
    public void clean() {
        System.out.println("El camión se está limpiando");
    }
}
