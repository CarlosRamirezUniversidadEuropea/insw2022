package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class empresaEmpleado extends empleado{

    private String nombre;

    public empresaEmpleado(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar(){
        String nombreEmpleado = "";
        System.out.println("El nombre del empleado de la empresa es " + nombreEmpleado);
    }
}
