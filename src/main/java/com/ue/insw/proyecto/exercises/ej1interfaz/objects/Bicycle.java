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
    private int time;

    public Bicycle(BrandBicycle brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }
    public Bicycle(BigDecimal price) {
        super(price);
    }
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.err.println("Error, velocidad negativa");
        }
    }
    public void startDriving (int speed, int time) throws Exception{
        if(speed < getMaxSpeed() &&  speed > 0){
            System.out.println("Conduciendo Bicicleta");
            this.speed = speed;
            this.time = time;
        } else {
            throw new Exception("Datos introducidos erroneos");
        }
    }
    @Override
    public void clean() {
        System.out.println("Limpiando Bicicleta");
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

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.err.println("Error, velocidad negativa");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Datos de Bicicleta [" +
                "Marca=" + brand +
                ", Color=" + color +
                ", MaxSpeed=" + maxSpeed +
                ", Speed=" + speed +
                ']';
    }
}
