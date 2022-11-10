package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;


public class Truck extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private Gasoline tipoGasoline;
    private int litrosTotales;
    private int litrosActuales;
    private int kilosSoportados;

    public Truck(Brand brand, Color color, int maxSpeed, Gasoline tipoGasoline, int litrosTotales, int litrosActuales, int kilosSoportados, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.tipoGasoline=tipoGasoline;
        this.litrosTotales=litrosTotales;
        this.litrosActuales=litrosActuales;
        this.kilosSoportados=kilosSoportados;
    }

    @Override
    public void clean() {

    }
}
