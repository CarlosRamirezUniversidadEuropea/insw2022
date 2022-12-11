package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{

    private double sueldo_bruto;

    public Empleado(double sueldo_bruto,String nombre, int edad){
        super(nombre,edad);
        this.sueldo_bruto=sueldo_bruto;

    }

    public double calcular_salario_neto() {
        return sueldo_bruto*0.8;
    }

    public String mostrar() {
        return "Empleado{" +
                "sueldo_bruto=" + sueldo_bruto +
                '}';
    }
}
