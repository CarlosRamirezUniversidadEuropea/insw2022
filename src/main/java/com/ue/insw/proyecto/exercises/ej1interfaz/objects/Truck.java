package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private int maxKilos;
    private int cargaCamion;

    private int maxSpeed;

    public Truck(BigDecimal price, Color color, int maxKilos) {
        super(price, color);
        this.maxKilos = maxKilos;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        } else
            throw new Exception("Velocidad errónea");
    }

    @Override
    public void clean() {
        System.out.println("Limpiando el camión");
    }

    public int getMaxKilos() {
        return maxKilos;
    }

    public void setMaxKilos(int maxKilos) {
        this.maxKilos = maxKilos;
    }

    public int getCargaCamion() {
        return cargaCamion;
    }

    public void setCargaCamion(int cargaCamion) throws Exception {
        if (cargaCamion > maxKilos) {
            throw new Exception("El camión no soporta esa carga");
        }else{
            System.out.println("Han sido cargados " + cargaCamion + " kg");
            this.cargaCamion = cargaCamion;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "máximo de kilos soportables =" + maxKilos +
                ", carga de camion=" + cargaCamion +
                '}';
    }
}