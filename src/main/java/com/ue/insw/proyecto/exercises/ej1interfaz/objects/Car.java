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

    private Gasoline tipoGasolina;

    private int litrosActuales;


    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, int litrosActuales, Gasoline tipoGasolina) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.litrosActuales = litrosActuales;
        this.tipoGasolina = tipoGasolina;

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


    }


    /**
     * Starts driving the car
     *
     * @param speed desired to drive
     * @param time  in seconds
     */
    public void startDriving(int speed, int time) {
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
        if (maxSpeed < 0) {
            throw new Exception("La velocidad debe de ser positiva");
        } else {
            this.maxSpeed = maxSpeed;
            System.out.println("La velocidad se ha modificado");
        }

    }

    public int getSpeed() {
        return speed;
        }



        @Override
        public String toString () {
            return "Car{" +
                    "brand=" + brand +
                    ", color=" + color +
                    ", maxSpeed=" + maxSpeed +
                    ", speed=" + speed +
                    ", status=" + status +
                    ", tipoGasoline=" + tipoGasolina +
                    '}';
        }


    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
        System.out.println("La cantidad de litros actuales es de: " + litrosActuales);

    }

    public void setTipoGasolina(Gasoline tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        System.out.println("El tipo de gasolina es " + tipoGasolina);

    }
}
