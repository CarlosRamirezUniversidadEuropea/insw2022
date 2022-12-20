package com.ue.insw.proyecto.exercises.ej1interfaz.objects;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {
    private TruckBrand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    private Gasoline gasoline;
    private int actualLiters;


    private int cargaKilos;


    public Truck(TruckBrand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.cargaKilos=0;
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
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        if (this.gasoline == gasoline) {
            actualLiters = actualLiters + liters;
            System.out.println("relllenastes" + liters + "litros llenados");
        } else {
            throw new Exception("el combustible no coincide con lo del coche");

        }
        //todo Create method to fill car

    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */


    public void startDriving (int speed, int time) throws Exception{
        if (actualLiters<0){
            System.out.println("comprobando si el camion tiene combustible");
            System.out.println("el camion tiene " + actualLiters+ "litros");
        }else{
            throw new Exception("el camion no tiene combustible, rellenar urgente");
        }
        // todo Create method to start driving
    }

    @Override
    public void clean() {
        System.out.println("Camión limpiándose");
    }

    public TruckBrand getBrand() {
        return brand;
    }

    public void setBrand(TruckBrand brand) {
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


    public void agregarkilos(int kilos) throws Exception{
        if (cargaKilos <= 33000){
            cargaKilos= cargaKilos + kilos;
            System.out.println("el paso de la carga del camion es de: ");
        }else {
            throw new Exception("el camion ha superado el peso maximo");
        }
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

