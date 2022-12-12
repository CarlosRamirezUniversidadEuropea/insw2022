package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;

public class Directivo extends Empleado{
    ArrayList<Empleado> subordinados = new ArrayList<Empleado>();
    String categoria;

    public Directivo(String nombre, int edad, double sueldo_bruto, String categoria){
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    public void mostrar(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Sueldo Bruto: " +sueldo_bruto);
        System.out.println("Categoria: " +categoria);
    }
}
