package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{

    private double sueldo_bruto;

    public Empleado(double sueldo_bruto,String nombre, int edad){
        super(nombre,edad);
        this.sueldo_bruto= 0.46 * sueldo_bruto;

    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
}
