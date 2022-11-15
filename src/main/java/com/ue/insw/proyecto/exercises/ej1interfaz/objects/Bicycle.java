package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable{

    private BrandBicycle brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle(BrandBicycle brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public Bicycle(BigDecimal price) {
        super(price);
    }
    public void on() {
        this.status = ON;
    }
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void startDriving (int speed, int time) {
        // todo Create method to start driving
    }
    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }
    public BrandBicycle getBrand() {
        return brand;
    }
    public void setBrand(BrandBicycle brand) {
        this.brand = brand;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
