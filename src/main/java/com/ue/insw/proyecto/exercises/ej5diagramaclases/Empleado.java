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
        System.out.println("Sueldo Bruto: " +sueldo_bruto);
        calcular_salario_neto(sueldo_bruto);
    }

    void calcular_salario_neto(double sb){
        double salario_neto, impuestos;
        impuestos = sb * 0.06;
        salario_neto = sb - impuestos;
        System.out.println("Salario neto: " +salario_neto);
    }
}
