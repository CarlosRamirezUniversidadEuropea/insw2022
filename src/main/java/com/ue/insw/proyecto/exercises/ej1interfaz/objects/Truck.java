package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable{
    private BigDecimal price;
    private BrandTruck brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Truck(BrandTruck brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public void clean() {
        System.out.println("Camión limpiándose");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public BrandTruck getBrand() {
        return brand;
    }
    public void setBrand(BrandTruck brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
