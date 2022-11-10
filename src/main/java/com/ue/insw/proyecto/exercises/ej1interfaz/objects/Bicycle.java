package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;
    private int maxSpeed;

    public Bicycle(BigDecimal price, Color color, Brand brand) {
        super(price, color);
        this.brand = brand;
    }

    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if(maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        }else{
            throw new Exception("Velocidad mal introducida");
        }
    }

    public void startRiding(){
        System.out.println("Estás utilizando la bicicleta");
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
