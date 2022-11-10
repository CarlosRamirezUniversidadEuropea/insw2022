package com.ue.insw.proyecto.exercises.ej1interfaz.objects;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

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

    private int maxKilosSoportables;


    public Truck(Brand brand, Color color, int maxSpeed, BigDecimal price, int maxKilosSoportables) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.maxKilosSoportables= maxKilosSoportables;
    }

    public Truck(BigDecimal price) {
        super(price);
    }

    //todo javadoc

    /**
     *
     */
    public void on() {
        this.status = ON;
    }

    //todo javadoc
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc

    /**
     *
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
    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill car
        System.out.println("La cantidad de gasolina es de "+liters);

    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */


    public void startDriving (int speed, int time) {
        // todo Create method to start driving
        setSpeed(speed);
        System.out.println("El camion  ha empezado a conducir");
    }

    @Override
    public void clean() {
        System.out.println("Camión limpiándose");
    }

    public Brand getBrandBike() {
        return brand;
    }

    public void setBrandBike(Brand brand) {
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


    public void setmaxKilosSoportables(int maxKilosSoportables){
        this.maxKilosSoportables= maxKilosSoportables;
        System.out.println("La cantidad de maximo de kilogramos soportables es: " + maxKilosSoportables);



    }


    public void setMaxSpeed(int maxSpeed) throws Exception {
        this.maxSpeed = maxSpeed;
        if (maxSpeed < 0 ) {
            throw new Exception("La velocidad debe de ser positiva");
        } else {
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
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}

