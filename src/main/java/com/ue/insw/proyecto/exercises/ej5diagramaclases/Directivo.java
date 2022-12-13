package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends  Empleado{

    private int categoria;

    public Directivo(int categoria, double sueldo_bruto, String nombre,int edad){
        super (sueldo_bruto,nombre,edad);
        this.categoria = categoria;
    }

    public String mostrar(){
        return "Directivo" +
                "categoria=" + categoria +
                '}';
    }
}
