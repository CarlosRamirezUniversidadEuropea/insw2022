package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(int Edad) {
        this.edad = Edad;
    }

    public void mostrar() {
        System.out.println("Edad: " + edad);
    }
}
