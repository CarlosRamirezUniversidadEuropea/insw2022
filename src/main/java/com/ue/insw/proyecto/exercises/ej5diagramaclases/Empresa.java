package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empresa {
    String nombre_empresa;
    private int nombre;

    public void Empresa(String nombre_empresa){
        this.nombre_empresa=nombre_empresa;
    }

    public int getNombre_empresa() {
        return nombre;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
}
