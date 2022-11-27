package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal implements Speak{

    private String raza;
    private String nombre;
    private int edad;

    public Animal(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void speak() {

    }
}
