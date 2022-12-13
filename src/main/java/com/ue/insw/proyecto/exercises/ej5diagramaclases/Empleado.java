package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{

    private double sueldo_bruto;

    public Empleado(String nombre, int edad, double sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public double calcular_salario_neto(){
        return sueldo_bruto*0.75;
    }

    public String toString(){
        String sRet = ", empleado con un salario neto: " + calcular_salario_neto();
        return sRet;
    }
}
