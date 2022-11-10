package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

public class Car extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private Gasoline gasoline;
    private int litrosActuales;

    private int time;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, int litrosActuales) {
        super(price, color);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.litrosActuales = litrosActuales;
    }

    public Car(BigDecimal price, Color color) {
        super(price, color);
    }

    /**
     * Turns the car on
     */
    public void on() {
        this.status = ON;
    }


    /**
     * Stops the car
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }


    /**
     * Sets the speed of the car
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        if (gasoline == this.gasoline){
            System.out.println("Coche llenado");
        }else{
            throw new Exception("Cantidad de gasolina incorrecta");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception {
        if(getLitrosActuales() > 0 && (speed < getMaxSpeed())){
            System.out.println("Coche conduciendo");
            this.speed = speed;
            this.time = time;
        }else{
            throw new Exception("Datos introducidos incorrectamente");
        }
    }

    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if(maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        }else{
            throw new Exception("Velocidad mal introducida");
        }
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    public void setGasoline(Gasoline gasoline) {
        this.gasoline = gasoline;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int liters) {
        this.litrosActuales = liters;
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

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", gasoline=" + gasoline +
                ", litrosActuales=" + litrosActuales +
                ", time=" + time +
                '}';
    }
}
