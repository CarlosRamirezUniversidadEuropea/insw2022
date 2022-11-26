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
    private Gasoline gasoline;
    private double liters;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gasoline, int liters) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasoline = gasoline;
        this.liters = liters;
    }

    public Car(BigDecimal price) {
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

    /**
     * fills the car with gasoline
     *
     * @param gasoline type of gas
     * @param liters   number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill car
        if (liters > 0 && (gasoline == this.gasoline)) {
            System.out.println("Perfecto");
        } else if (liters >= 0 && (gasoline != this.gasoline)) {
            System.out.println("No es el tipo de gasolina correcto");
        } else if (liters == 0 && (gasoline == this.gasoline)) {
            System.out.println("Sin gasolina");
        } else {
            System.out.println("Error");
        }
    }

    /**
     * Starts driving the car
     *
     * @param speed desired to drive
     * @param time  in seconds
     */
    public void startDriving(int speed, int time) {
        // todo Create method to start driving
        if (speed == 0 && time == 0) {
            System.out.println("Start");
        } else if (speed == 0 && time >= 0) {
            System.out.println("Stop");
        } else {
            System.out.println("Drive");
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
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("No puede ser menor que 0.");
        }
    }

        public int getSpeed () {
            return speed;
        }

        public Status getStatus () {
            return status;
        }

        public void setStatus (Status status){
            this.status = status;
        }

        @Override
        public String toString () {
            String sRet = "Bicycle: ";
            sRet += "Brand: " + brand + "\n";
            sRet += "Color: " + color + "\n";
            sRet += "Max Speed : " + maxSpeed + "\n";
            sRet += "Speed: " + speed + "\n";
            sRet += "Status: " + status + "\n";
            return sRet;
        }
}

