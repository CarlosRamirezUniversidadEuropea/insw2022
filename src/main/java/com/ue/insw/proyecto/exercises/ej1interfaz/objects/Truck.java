package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private Brand brand;

    private Color color;

    private int ruedas;

    private int peso;

    private Status status;


    public Truck(Brand brand, Color color, int peso, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.peso = peso;
        this.ruedas = ruedas;
        this.status = STOPED;
    }
    @Override
    public void clean() {
        System.out.println("Truck limpiándose");
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", status=" + status +
                '}';
    }


}
