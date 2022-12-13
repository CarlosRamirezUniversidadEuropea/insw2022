package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empresa {
    private String nombre;

    public Empresa(String nombre, Cliente cliente, Empleado empleado) {
        super();
        this.nombre = nombre;
    }

    public String toString(){
        return "Empresa: " + nombre;
    }
}
