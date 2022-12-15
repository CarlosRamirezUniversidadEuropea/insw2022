package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private Cliente[] clientes;

    public Empresa(String nombre, Empleado[] empleados, Cliente[] clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                ", clientes=" + Arrays.toString(clientes) +
                '}';
    }
}
