package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    double sueldo_bruto;

    public Empleado(String firstName, String lastName, int edad) {
        super(firstName, lastName, edad);
        this.sueldo_bruto=sueldo_bruto;

    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    @Override
    public String   toString() {
        return "Empleado{" +
                "sueldo_bruto=" + sueldo_bruto +
                '}';
    }
}
