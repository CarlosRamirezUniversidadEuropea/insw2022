package com.ue.insw.proyecto.exercises.ej5diagramaclases;
import java.util.ArrayList;

public class Empleado extends Persona{

    double sueldo_bruto, impuestos;

    void mostrar(){
        System.out.println("Sueldo Bruto: " +sueldo_bruto);
        calcular_salario_neto(sueldo_bruto, impuestos);
    }

    void calcular_salario_neto(double sb, double imp){
        double salario_neto;
        salario_neto = sb - imp;
        System.out.println("Salario neto: " +salario_neto);
    }
}
