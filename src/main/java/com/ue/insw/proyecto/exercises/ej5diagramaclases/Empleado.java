package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    private int sueldo_bruto;

    public Empleado(String nombre, int edad, int sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public int calcular_salario_neto(){
        return (int)(sueldo_bruto*(1-0.21f));
    }
    public void mostrar(){
        System.out.println(this.toString());
    }
    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo_bruto=" + sueldo_bruto +
                '}';
    }
}
