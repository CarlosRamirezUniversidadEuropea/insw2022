package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empresa {
    String nombre;

    public Empresa(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
