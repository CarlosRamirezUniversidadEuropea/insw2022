package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.GasolineVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private BrandVehicle brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private int time;
    private Status status;
    private GasolineVehicle gas;
    private int liters;

    public Car(BrandVehicle brand, Color color, int maxSpeed, BigDecimal price, int liters, GasolineVehicle gas) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.liters = liters;
        this.gas = gas;
    }

    public Car(BigDecimal price) {
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
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.err.println("Error, no puede tener velocidad negativa");
        }
    }

    public void fillCombustible(GasolineVehicle gasoline, int liters) {
        if(gas.equals(gasoline)) {
            this.liters += liters;
            System.out.println("Tanque de coche rellenado. Litros: " + getLiters());
        } else {
            System.err.println("Combustible erroneo.");
        }
    }

    public void startDriving (int speed, int time) throws Exception{
        if(getLiters() > 0 && speed < getMaxSpeed() && speed > 0){
            System.out.println("Coche acelerando");
            setSpeed(speed);
            setTime(time);
            on();
        } else {
            throw new Exception("Datos introducidos erroneos");
        }
    }

    @Override
    public void clean() {
        System.out.println("Limpiando coche");
    }

    public BrandVehicle getBrand() {
        return brand;
    }

    public void setBrand(BrandVehicle brand) {
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
        if(maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.err.println("Error, no puede tener velocidad negativa");
        }
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

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public GasolineVehicle getGas() {
        return gas;
    }

    public void setGas(GasolineVehicle gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Datos del coche [" +
                "Marca=" + brand +
                ", Color=" + color +
                ", MaxSpeed=" + maxSpeed +
                ", Speed=" + speed +
                ", Time=" + time +
                ", Status=" + status +
                ", Gas=" + gas +
                ", Litros=" + liters +
                ']';
    }
}
