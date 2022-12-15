package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
