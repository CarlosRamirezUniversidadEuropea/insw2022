package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;

public class Empresa {
    private String nombre;

    ArrayList<Empleado>empleados= new ArrayList<Empleado>();
    ArrayList<Cliente>clientes= new ArrayList<Cliente>();

    public Empresa(String nombre){
        this.nombre=nombre;

    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String toString(){
        return "Empresa: "+ nombre;
    }

}
