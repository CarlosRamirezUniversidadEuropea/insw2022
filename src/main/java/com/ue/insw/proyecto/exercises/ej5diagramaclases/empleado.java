package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import com.ue.insw.proyecto.exercises.documentation.Persona;

public class empleado extends Persona {

    private double sueldo_bruto;

    public void mostrar(){
        double sueldo_bruto = 0;
        System.out.println("El sueldo bruto de la persona es " + sueldo_bruto);
    }

    public int calcular_salario_neto(){
        double sueldo_bruto = 0;
        double impuestos = 0;
        double seguridad_social = 0;
        double salarioNeto;

        salarioNeto = sueldo_bruto - impuestos - seguridad_social;

        System.out.println("El salario neto del trabajador es: " + salarioNeto);
        return 0;

    }
}
