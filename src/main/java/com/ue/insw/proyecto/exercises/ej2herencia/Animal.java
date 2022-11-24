package com.ue.insw.proyecto.exercises.ej2herencia;

public class Animal implements Speak{

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


    public void speak() {
        System.out.println("");
    }
}
