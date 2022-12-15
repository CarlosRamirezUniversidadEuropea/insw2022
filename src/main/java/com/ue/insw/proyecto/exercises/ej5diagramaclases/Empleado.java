package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona {

    float sueldo_bruto;

    public Empleado(String nombre, int edad, float sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public float getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Salario Bruto Anual: "+ sueldo_bruto);
    }

    public void calcular_salario_neto() {
        float salario_neto = (sueldo_bruto - 3000 - 11000) / 12;
        System.out.println("Tu salario neto mensual es de "+salario_neto);
    }
}
