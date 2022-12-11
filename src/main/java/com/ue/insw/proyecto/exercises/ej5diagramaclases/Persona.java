package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;

public class Persona {
    protected static String nombre;
    protected static int edad;

    public void setNombre(String nombre){
        nombre=nombre;
    }

    public void setEdad(int edad){
        edad=edad;
    }

    public static void mostrar() {
        System.out.println( "Nombre: "+ nombre +"; edad: "+ edad);
    }
}
