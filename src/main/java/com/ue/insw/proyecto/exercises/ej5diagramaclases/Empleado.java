package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    double sueldo_bruto;

    public Empleado(String nombre, int edad, double sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }
    public double Neto() {
        return sueldo_bruto-(0.25*sueldo_bruto);
    }
    @Override
    public String toString() {
        return "Empleado{"+ "nombre= " + nombre + ", edad= "+ edad +" Sueldo neto= "+ Neto() + '}';
    }
}