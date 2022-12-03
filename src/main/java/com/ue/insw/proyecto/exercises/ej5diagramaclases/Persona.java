package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    private String nombre;
    private String apellido;
    private String puesto;

    private String empresa;
    private int edad;
    private int telefono;

    public Persona(String nombre,String apellido, String puesto,String empresa,int edad,int telefono){
     this.nombre=nombre;
      this.apellido=apellido;
      this.puesto=puesto;
       this.empresa=empresa;
       this.edad=edad;
       this.telefono=telefono;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puesto='" + puesto + '\'' +
                ", empresa='" + empresa + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
