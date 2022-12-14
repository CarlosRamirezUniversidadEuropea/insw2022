package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private Cliente[] clientes;

    Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}