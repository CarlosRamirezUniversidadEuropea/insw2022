package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends  Persona {
    private double sueldo_bruto;

    public Empleado(int Edad, double Sueldo_bruto) {
        super(Edad);
        this.sueldo_bruto = Sueldo_bruto;
    }

    public void mostrar() {
        System.out.println("Sueldo bruto: " + sueldo_bruto);
    }

    public double calcular_salario_neto() {
        double deducciones = 400.0;
        double salarioNeto = sueldo_bruto - deducciones;
        return salarioNeto;
    }
}
