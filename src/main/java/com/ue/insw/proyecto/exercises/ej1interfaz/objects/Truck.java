package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    private Gasoline gasoline;

    private int litros;

    private int Kilos;

    public Truck(Brand brand, Color color, int maxSpeed, BigDecimal price, int litros,  Gasoline gasoline,int kilos) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public Truck(BigDecimal price) {
        super(price);
    }

    public void on() {
        this.status = ON;
    }

    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill car
        if(this.gasoline.equals(gasoline)){
            System.out.println("La gasolina es correcta");
        }else{
            System.out.println("La gasolina que le intentas poner es incorrecto");
        }

    }
    public void startDriving (int speed, int time) {
        // todo Create method to start driving
        if(getLitros() >0&& speed<=getMaxSpeed()){
            System.out.println("Camión conduciendo");
        }else{
            System.out.println("Camión no conduciendo");
        }
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

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    public void setGasoline(Gasoline gasoline) {
        this.gasoline = gasoline;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getKilos() {
        return Kilos;
    }

    public void setKilos(int kilos) {
        Kilos = kilos;
    }

    @Override
    public void clean() {

    }

}
