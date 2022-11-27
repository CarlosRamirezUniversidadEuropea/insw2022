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
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    private int liters;
    private Gasoline gasoline;
    private int litrosAñadidos;
    private int litrosActuales;


    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }

    public Car(BigDecimal price) {
        super(price);
    }


    //todo javadoc
    /**
     * Gets the car status
     * @param status desired to know if it is stoped or not
     */
    public void on() {
        this.status = ON;
    }

    //todo javadoc
    /**
     * weather the car is stoped or not
     * @param stop to check if the car status stoped or driving
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc
    /**
     * Set up the car speed
     * @param speed desired to drive
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline) throws Exception {
        if (this.gasoline == gasoline) {
            liters = (litrosAñadidos + litrosActuales);
            System.out.println(" Has rellenado " + liters + " Litros con exito :)");

        } else {
            throw new Exception("El combustible no coincide con lo del coche ");
        }



        //todo Create method to fill car
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time, int gasoline) throws Exception {

    if (liters < 0){
        System.out.println("Comprobando si el coche tiene Combustible");
        System.out.println("El coche tiene: "+ liters + " Litros ");

    }else {
        throw new Exception ("El coche no tiene Combustible Porfavor inserte Combustible para arrancar el coche");
    }

    if (speed >= maxSpeed) {
        System.out.println("Velocidad Correcta :) ");
    }else{
       throw new Exception ("Velocidad Alta :( porfavor baje la velocidad");
    }

     // todo Create method to start driving
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
    public void setMaxSpeed(int maxSpeed) throws Exception {
        this.maxSpeed = maxSpeed;
        if (maxSpeed <0 ){
            throw new Exception("El numero tiene que ser positivo");
        }else{
            this.maxSpeed = maxSpeed;
            System.out.println("La velocidad se ha modificado");
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

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ",gasoline=" + gasoline +
                '}';
    }
}
