package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;
public class Bicycle extends Vehicle implements Cleanable {
    public Bicycle(BigDecimal price) {
        super(price);
    }

    @Override
    public void clean() {
        System.out.println("La bicicleta se está limpiando");
    }
}
