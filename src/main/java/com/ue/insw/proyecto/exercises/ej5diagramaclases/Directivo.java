package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Persona {
    String categoria;

    public Directivo(String nombre, int edad, String categoria) {
        super(nombre, edad);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
