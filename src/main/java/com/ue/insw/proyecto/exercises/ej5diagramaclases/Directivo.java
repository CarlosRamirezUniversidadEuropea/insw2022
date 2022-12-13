package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado{
    private String categoria;

    public Directivo(String nombre, int edad, double sueldo_bruto, String categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    public String toString() {
        String sRet = ", de la categoría: " + categoria;
        return sRet;
    }

    //No entiendo la relación de subordinados, creo que es como está puesto arriba.
}
