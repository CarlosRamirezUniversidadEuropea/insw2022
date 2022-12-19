package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Persona{
    String categoria;

    public Directivo(String firstName, String lastName, int edad, String categoria) {
        super(firstName, lastName, edad);
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                '}';
    }
}
