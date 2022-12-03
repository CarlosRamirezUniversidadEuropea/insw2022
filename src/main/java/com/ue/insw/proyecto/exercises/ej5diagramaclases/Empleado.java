package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    public Empleado(String nombre,String apellido, String puesto,String empresa,int edad, int telefono) {
        super(nombre,apellido,puesto,empresa,edad,telefono);
    }


    public static void Persona() {
        System.out.println("Juan "+" Rodriguez "+" Empleado "+" BBVA "+" 31 "+" 332431769");
    }
}
