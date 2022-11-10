package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import java.math.BigDecimal;

public class Truck extends Vehicle implements Cleanable {

    private int maxKilosSoportables;
    private int cargaCamion;

    public Truck(BigDecimal price,Color color, int maxKilosSoportables) {
        super(price, color);
        this.maxKilosSoportables = maxKilosSoportables;
    }


    @Override
    public void clean() {
        System.out.println("Camión limpiándose");
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
        if(cargaCamion > maxKilosSoportables){
            throw new Exception("El camión no puede llevar tanta carga");
        }else{
            System.out.println("Se han cargado " + cargaCamion + " kilos");
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
