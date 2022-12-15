package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    private double sueldo_bruto;

    public Empleado(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    public double calcular_salario_neto(){

        return (sueldo_bruto*(1-0.21));
    }

    public String toString() {
        return "Empleado{" +
                "sueldo_bruto=" + sueldo_bruto +
                '}';
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
}
