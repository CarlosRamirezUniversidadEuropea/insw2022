package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.GasolineVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private BrandVehicle brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private int time;
    private Status status;
    private GasolineVehicle gas;
    private int liters;

    public Car(BrandVehicle brand, Color color, int maxSpeed, BigDecimal price, int liters, GasolineVehicle gas) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.liters = liters;
        this.gas = gas;
    }

    public Car(BigDecimal price) {
        super(price);
    }

    //Enciende el coche
    public void on() {
        this.status = ON;
    }

    //Detiene el coche
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //Velocidad que va el coche
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.err.println("Error, no puede tener velocidad negativa");
        }
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(GasolineVehicle gasoline, int liters) {
        //Rellena el coche de combustible, compara que el tipo de combustible que echas sea igual al que es, si no lo es te dice que el tipo de combustible es erroneo.
        if(gas.equals(gasoline)) {
            this.liters += liters;
            System.out.println("Coche llenado. Litros: " + getLiters());
        } else {
            System.err.println("Combustible erroneo.");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception{
        if(getLiters() > 0 && speed < getMaxSpeed() && speed > 0){
            System.out.println("Coche conduciendo");
            setSpeed(speed);
            setTime(time);
            on();
        } else {
            throw new Exception("Datos introducidos erroneamente");
        }
    }

    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
    }

    public BrandVehicle getBrand() {
        return brand;
    }

    public void setBrand(BrandVehicle brand) {
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
        if(maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.err.println("Error, no puede tener velocidad negativa");
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

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public GasolineVehicle getGas() {
        return gas;
    }

    public void setGas(GasolineVehicle gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", time=" + time +
                ", status=" + status +
                ", gas=" + gas +
                ", liters=" + liters +
                '}';
    }
}
