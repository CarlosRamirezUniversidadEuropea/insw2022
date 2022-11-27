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

    /**
     * Encender el coche
     */
    public void on() {
        this.status = ON;
    }

    /**
     * Parar el coche
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    /**
     * Setear la velocidad
     * @param speed velocidad
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        Gasoline gasolineType = null;
        int capacity = 0;
        if (gasolineType == gasoline){
            throw new Exception("Tipo de gasolina introducido incorrecto.");
        }
        else{
            System.out.println("Ha seleccionado "+ gasoline);
            if(capacity<liters || liters<0){
                throw new Exception("No puede echar esa cantidad de gasolina.");
            }
            else{
                System.out.println("Ha repostado "+ liters);
            }
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param capacity in liters
     */
    public void startDriving (int speed, int capacity) throws Exception {
        if(capacity<0 && speed<0 && speed>maxSpeed){
            throw new Exception("Velocidad o gasolina incorrecta.");
        }else{
            System.out.println("El coche está en marcha.");
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

    public void setMaxSpeed(int maxSpeed) throws Exception{
        this.maxSpeed = maxSpeed;
        if (maxSpeed>=0){
            System.out.println("Velocidad máxima seteada correctamente. ");

        }else{
            throw new Exception("Error. Velocidad incorrecta");
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
                '}';
    }
}
