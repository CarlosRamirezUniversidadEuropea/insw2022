package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;



import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;
    private int maxSpeed;
    public Bicycle(BigDecimal price, Color color, Brand brand) {
        super(price, color);
        this.brand = brand;
    }

    @Override
    public void clean() {

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

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        } else
            throw new Exception("Velocidad errónea");
    }

    public boolean startRiding (){
        System.out.println("Estás utilizando la bicicleta");
        return false;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}