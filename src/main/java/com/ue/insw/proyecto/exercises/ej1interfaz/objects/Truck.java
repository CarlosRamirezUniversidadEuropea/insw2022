package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

public class Truck extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Truck(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }

    public Brand getBrand(String citroen) {
        return brand;
    }

    public Color getColor(String green) {
        return color;
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
        this.speed = speed;
    }

    public void fillCombustible(Gasoline gasoline, int liters) {

        }

    private void fillCar() {
        fillCombustible();
    }

    private void fillCombustible() {                //Siendo la capacidad máxima del camión 50 l
        int capacidadMax = 0;
        System.out.println("Cuanta gasolina quiere echar?");
        //Leemos la variable que contenga la cantidad de gasolina. En este caso: capacidadMax.
        if(capacidadMax == 50){
            System.out.println("Se ha alcanzado la máxima capacidad de gasolina. ");
        }else if(capacidadMax > 50){
            System.out.println("Se ha sobrepasado la máxima capacidad de gasolina");
        }else{
            System.out.println("Rellenando gasolina");
        }

    }


    private void startDriving (int speed, int time) {
        startDriving(speed, time);
    }

    @Override
    public void clean() {
        System.out.println("El camión se está limpiando");
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

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}



