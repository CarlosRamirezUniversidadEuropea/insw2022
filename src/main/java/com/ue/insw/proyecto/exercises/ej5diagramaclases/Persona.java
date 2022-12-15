package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {

    private String edad;
    private String nombre;

    public Persona(String edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrar() {
        return "Persona{" +
                "edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
