package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private int maxKilosSoportables;
    private int cargaCamion;
    public Truck(BigDecimal price, Color color, int maxKilosSoportables) {
        super(price, color);
        this.maxKilosSoportables = maxKilosSoportables;
    }

    @Override
    public void clean() {
        System.out.println("Limpiando el camión");
    }

    public int getMaxKilosSoportables() {
        return maxKilosSoportables;
    }

    public void setMaxKilosSoportables(int maxKilosSoportables) {
        this.maxKilosSoportables = maxKilosSoportables;
    }

    public int getCargaCamion() {
        return cargaCamion;
    }

    public void setCargaCamion(int cargaCamion) throws Exception {
        if (cargaCamion > maxKilosSoportables) {
            throw new Exception("El camión no puede llevar esa carga");
        }else{
            System.out.println("Se han cargado " + cargaCamion + " kg");
            this.cargaCamion = cargaCamion;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxKilosSoportables=" + maxKilosSoportables +
                ", cargaCamion=" + cargaCamion +
                '}';
    }
}
