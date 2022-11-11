package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import java.math.BigDecimal;


//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private BrandBicycle brand;
    private ColorBicycle color;
    private int maxSpeedBicycle;
    private int speed;
    private int time;

    public Bicycle(BrandBicycle brand, ColorBicycle color,int maxSpeedBicycle,BigDecimal price) {
        super(price);
        this.maxSpeedBicycle = maxSpeedBicycle;
        this.brand = brand;
        this.color = color;
        this.speed = 0;

    }



    //todo javadoc

    public void on() {

    }

    //todo javadoc
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startRiding (int speed, int time) throws Exception {
        // todo Create method to start riding
        if(speed >= 0 && speed <= maxSpeedBicycle){
            if (speed>0){
                System.out.println("Bici en movimiento");
            }else{
                System.out.println("BICI PARADA");
            }
            this.speed = speed;
            this.time = time;
        }else{
            throw new Exception("Datos introducidos incorrectamente");
        }


    }

    @Override
    public void clean() {
        System.out.println("Bici limpiadose");
    }

    public BrandBicycle getBrand() {
        return brand;
    }

    public int getMaxSpeedBicycle() {
        if (maxSpeedBicycle< 0){
            this.speed = -maxSpeedBicycle;
        }
        return maxSpeedBicycle;
    }
    public void setBrand(Brand brand) {

    }

    public ColorBicycle getColor() {
        return color;
    }

    public void setColor(ColorBicycle color) {
        this.color = color;
    }



    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception{

        if(speed > 0 ){
            System.out.println("La velocidad maxima es "+maxSpeed);

        }else{
            throw new Exception("La velocidad no puede ser negativa");
        }

    }


    public int getSpeed() throws Exception {

        if (speed < 0) {
            throw new Exception("La velocidad no puede ser negativa");
        }
        return speed;

    }

    @Override
    public String toString() {

        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeedBicycle+
                '}';
    }
}
