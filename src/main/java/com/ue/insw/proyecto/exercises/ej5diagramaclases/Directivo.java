package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;

public class Directivo extends Empleado{
    ArrayList<Empleado> subordinados = new ArrayList<Empleado>();
    String categoria;

    void mostrar(){
        System.out.println("Categoria: " +categoria);
    }
}
