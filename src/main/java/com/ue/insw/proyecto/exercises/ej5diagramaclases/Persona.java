package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + "\nEdad=" + edad ;
    }
}
