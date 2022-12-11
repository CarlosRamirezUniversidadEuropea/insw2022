package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;

    }





    public String mostrar() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
