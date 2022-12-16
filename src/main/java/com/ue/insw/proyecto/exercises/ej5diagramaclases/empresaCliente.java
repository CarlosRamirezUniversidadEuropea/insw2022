package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class empresaCliente extends cliente {

    private String nombre;

    public empresaCliente(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar(){
        String nombreCliente = "";
        System.out.println("El nombre del cliente de la empresa es " + nombreCliente);
    }
}
