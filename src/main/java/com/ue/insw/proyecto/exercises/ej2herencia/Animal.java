package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal{

    private String raza;
    private String nombre;
    private int edad;

    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
