package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    public Empresa(String nombre,List<Empleado> empleados, List<Cliente> clientes){
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public String mostrar(){
        return "Empresa{" +
                "nombre =" + nombre + '\'' +
                "empleados =" + empleados +
                "clientes = " + clientes +
                '}';
    }

}
