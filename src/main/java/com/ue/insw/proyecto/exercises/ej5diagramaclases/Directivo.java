package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;

public class Directivo extends Empleado{

    private String categoria;
    private ArrayList<Empleado> workers= new ArrayList<Empleado>();

    public Directivo(String nombre, int edad, double sueldoBruto, String categoria){
        super(nombre, edad, sueldoBruto);
        this.categoria=categoria;
    }

    public String toString(){
        return "Nombre: "+ getNombre()+"\nEdad: "+ getEdad()+ "\nSueldo: "+getSueldoBruto()+"\nCategoria: "+categoria;
    }
}
