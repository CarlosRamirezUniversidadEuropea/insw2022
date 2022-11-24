package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private BrandTruck brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private int time;
    private GasolineVehicle gas;
    private int liters;

    public Truck(BrandTruck brand, Color color,int maxSpeed, BigDecimal price, int liters) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.liters = liters;
        this.gas = GasolineVehicle.DIESEL;
    }

    public Truck(BigDecimal price) {
        super(price);
    }

    //todo javadoc
    public void on() {
        this.status = ON;
    }

    //todo javadoc
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.err.println("Error, no puede tener velocidad negativa");
        }
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(GasolineVehicle gasoline, int liters) {
        //Rellena el coche de combustible, compara que el tipo de combustible que echas sea igual al que es, si no lo es te dice que el tipo de combustible es erroneo.
        if(gas.equals(gasoline)) {
            this.liters = liters;
            System.out.println("Coche llenado.");
        } else {
            System.err.println("Combustible erroneo.");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        if(getLiters() > 0 && speed < getMaxSpeed()  && speed > 0){
            System.out.println("Tractpr conduciendo");
            setSpeed(speed);
            setTime(time);
            on();
        } else {
            throw new Exception("Datos introducidos erroneamente");
        }
    }

    @Override
    public void clean() {
        System.out.println("Tractor limpiándose");
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

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", time=" + time +
                ", gas=" + gas +
                ", liters=" + liters +
                '}';
    }
}
