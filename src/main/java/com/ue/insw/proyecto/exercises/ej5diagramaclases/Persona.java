package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    private String nombre;
    private int edad;

    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
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
}
