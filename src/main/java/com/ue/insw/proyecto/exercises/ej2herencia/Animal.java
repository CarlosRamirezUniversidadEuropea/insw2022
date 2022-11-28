package com.ue.insw.proyecto.exercises.ej2herencia;

public class Animal implements Speak{

    private String raza;
    private String name;

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Animal(String raza, String nombre) {
        this.raza = raza;
        this.name = nombre;
    }

    @Override
    public void speak() {
    }
}