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
    private int liters;
    private int Combustible;
    private int ltahora;
    private int ltañadidos;

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

    public Gasoline getGasoline() {
        return gasoline;
    }

    public void setGasoline(Gasoline gasoline) {
        this.gasoline = gasoline;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public int getCombustible() {
        return Combustible;
    }

    public void setCombustible(int combustible) {
        Combustible = combustible;
    }

    public int getLtahora() {
        return ltahora;
    }

    public void setLtahora(int ltahora) {
        this.ltahora = ltahora;
    }

    public int getLtañadidos() {
        return ltañadidos;
    }

    public void setLtañadidos(int ltañadidos) {
        this.ltañadidos = ltañadidos;
    }

    /**
     * fills the car with gasoline
     *
     * @param gasoline type of gas
     * @param liters   number of liters
     * @return
     */


    public double fillCombustible(Gasoline gasoline, int liters) throws Exception {
        //todo Create method to fill car
        if (this.gasoline == gasoline){
            liters=ltahora+ltañadidos;
            System.out.println("Haz ingresado "+ ltañadidos+"litros");
            System.out.println("Actualmete tieens "+ liters+"litros");
        } else {
            System.out.println("No se a podido ingresar gasolina");
        }

        return 0;
    }


    public double startDriving (int speed, int timen, int gasolina) throws Exception {
        if(liters==0||liters>2){
            System.out.println("El coche tiene "+liters+" litros, porfavor recargar combustible");
            } else {
            throw new Exception("El coche aun tiene combustible, no hace falta recargar"); }
        if(speed>maxSpeed) {
            System.out.println("Por favor, baje la velocidad");
            }else {
            throw new Exception("La velocidad es la correcta");
        }
        return 0;
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
        if(maxSpeed>0){
            System.out.println("La velocidad maxima ingresada ingreso con exito.");
        } else {

            throw new Exception("La maxima velocidad debe de ser positiva");
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
