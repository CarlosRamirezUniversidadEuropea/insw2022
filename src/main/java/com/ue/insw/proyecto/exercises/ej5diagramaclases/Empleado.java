package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{

    private double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto){
        super(nombre, edad);
        this.sueldoBruto=sueldoBruto;
    }

    public double getSueldoBruto() {
        double impuestos=sueldoBruto*0.06;
        double salarioNeto= impuestos-sueldoBruto;

        return sueldoBruto;
    }

    public String toString(){
        return "Nombre: "+ getNombre() +"\nEdad: "+getEdad()+"\nSueldo(Bruto): "+getSueldoBruto();
    }


}
