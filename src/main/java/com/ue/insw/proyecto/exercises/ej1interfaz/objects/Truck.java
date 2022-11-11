package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;
//todo extender de Vehicle
//todo implementar Cleanable
public class Truck extends Vehicle implements Cleanable {

    private BrandCamion brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private Gasoline gasolinetype;
    private int litrosdeposito;
    private int litrosactuales;
    private int time;

    public Truck(BrandCamion brand, Color color, int maxSpeed, BigDecimal price) {

        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasolinetype = gasolinetype;
        this.litrosdeposito = litrosdeposito;
        this.litrosactuales = 9;

    }

    public Truck(BigDecimal price) {
        super(price);
    }

    //todo javadoc
    /**
     * print status
     * STATUS ON
     * Sets speed 0
     */
    public void on() {
        if (speed>0){
            this.status = ON;
        }
    }

    //todo javadoc
    /**
     * print status
     * Status STOPED
     * Sets speed 0
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc
    /**
     * set speed
     * @param speed speed of the vehicle
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the truck with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill truck
        if (gasoline == gasolinetype && litrosactuales < 35){
            liters = litrosdeposito-litrosactuales;
            System.out.println("se llena con "+liters+"litros");
        }else{
            System.out.println("Tu coche no usa ese tipo de combustible");
        }

    }

    /**
     * Starts driving the truck
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        if(litrosactuales > 0 && speed <= maxSpeed){
            if (speed>0){
                System.out.println("Coche en movimiento");
            }else{
                System.out.println("Coche PARADO");
            }
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

    public BrandCamion getBrand() {
        return brand;
    }

    public void setBrand(BrandCamion brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        if (maxSpeed < 0){
            this.speed = -maxSpeed;
        }
        return maxSpeed;
    }

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public int setMaxSpeed(int maxSpeed) throws Exception {
        if(speed > 0 ){
            System.out.println("La velocidad maxima es "+maxSpeed);

        }else{
            throw new Exception("La velocidad no puede ser negativa");
        }

        return maxSpeed;
    }

    public int getSpeed() throws Exception {
        if (speed < 0) {
            throw new Exception("La velocidad no puede ser negativa");
        }
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
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
