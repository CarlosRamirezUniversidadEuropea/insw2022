package com.ue.insw.proyecto.exercises.ej5diagramaclases;
import java.util.ArrayList;

public class Empleado extends Persona{

    double sueldo_bruto;

    public Empleado(String nombre, int edad, double sueldo_bruto){
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public void mostrar(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Sueldo Bruto: " +sueldo_bruto+ "€");
    }

    public double calcular_salario_neto(){
        double salario_neto, impuestos;
        impuestos = sueldo_bruto * 0.06;
        salario_neto = sueldo_bruto - impuestos;
        return salario_neto;
    }
}
