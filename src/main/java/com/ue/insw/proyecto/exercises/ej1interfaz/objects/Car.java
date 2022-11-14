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
    private Gasoline tipoGasoline;
    private int litrosTotales;
    private int litrosActuales;



    public Car(Brand brand, Color color, int maxSpeed, Gasoline tipoGasoline,int litrosTotales, int litrosActuales, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.tipoGasoline=tipoGasoline;
        this.litrosTotales=litrosTotales;
        this.litrosActuales=litrosActuales;
    }

    public Car(BigDecimal price) {

        super(price);
    }


    //arrancar el coche
    public void on() {
        this.status = ON;
    }

    //parar el coche
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //marcar velocidad
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters, Gasoline tipoGasoline, int litrosActuales, int litrosTotales) {
        if(gasoline.equals(tipoGasoline) && litrosActuales<50) {
            System.out.println("Cuantos litros quieres repostar? ");
            liters=litrosTotales-litrosActuales;
            System.out.println("Has repostado " +liters+ " litros");
        }else {
            System.out.println("No es el tipo de gasolina correcta o tienes el deposito lleno");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time, int litrosActuales, int maxSpeed) {
        if(litrosActuales>0) {
            if (speed<maxSpeed) {
                System.out.println("Esta conduciendo sin problema alguno");
            }else {
                System.out.println("Reduzca la velocidad por favor, no se adecua a la via");
            }
        }else {
            System.out.println("No te queda gasolina vaya a repostar");
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

    public Gasoline getTipoGasoline() {
        return tipoGasoline;
    }

    public void setTipoGasoline(Gasoline tipoGasoline) {
        this.tipoGasoline = tipoGasoline;
    }

    public int getLitrosTotales() {
        return litrosTotales;
    }

    public void setLitrosTotales(int litrosTotales) {
        this.litrosTotales = litrosTotales;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", tipoGasoline=" + tipoGasoline +
                ", litrosTotales=" + litrosTotales +
                ", litrosActuales=" + litrosActuales +
                '}';
    }
}
