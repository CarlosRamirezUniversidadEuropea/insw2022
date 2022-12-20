package com.ue.insw.proyecto.exercises.ej1interfaz.objects;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;


//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
   private BrandBike brandbike;

    private Color color;

    private int maxSpeed;

    private int speed;

    private Status status;



    public Bicycle(BrandBike brandbike, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brandbike = brandbike;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status=STOPED;



    }

    public Bicycle(BigDecimal price) {
        super(price);
    }

    //todo javadoc

    public void on(){this.status=ON;}


    //todo javadoc
    public void stop() {
        this.speed = 0;
        this.status=STOPED;


    }

    //todo javadoc
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */



    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception{
        if (speed >= maxSpeed){
            System.out.println("Velocidad acertada");
            }
        else {
            throw new Exception("Velocidad alta, porfavor menora la velocidad");
        }
        // todo Create method to start driving
    }

    @Override
    public void clean() {
        System.out.println("Vehículo limpiándose");
    }

    public BrandBike getBrandBike() {
        return brandbike;
    }

    public void setBrandBike(BrandBike brandbike) {
        this.brandbike = brandbike;
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
    public void setMaxSpeed(int maxSpeed) throws Exception{
        this.maxSpeed = maxSpeed;
        if (maxSpeed <0){
            throw new Exception("El numero tiene que ser positivo: ");
        }else {
            this.maxSpeed=maxSpeed;
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
        return "Vehicle{" +
                "brand=" + brandbike +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +

                '}';
    }
}



