package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    private int sueldoBruto;

    public Empleado(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int calcSalarioNeto(){
        return (int)(sueldoBruto*(1-0.21f));
    }
    public void mostrar(){
        System.out.println(this.toString());
    }
    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo bruto=" + sueldoBruto +
                '}';
    }
}