package com.ue.insw.proyecto.exercises.ej5diagramaclases;



public abstract class Persona {
    private String Nombre;
    private int Edad;

    public Persona(String Nombre, String Tipo, String Puesto) {
        this.Nombre = Nombre;
        this.Edad= Edad;

    }


    public  String toString(){
        return "Persona{ "+Nombre+", "+Edad+"}";
    }

}
