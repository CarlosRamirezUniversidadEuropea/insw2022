package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal implements Speak{

    private String raza;
    private String nombre;
    private int edad;

    public Animal(String raza, String nombre,int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }



    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void speak() {

    }
}
