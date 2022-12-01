package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal implements Speak {

    private String raza;
    private String nombre;
    private int edad;

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

    @java.lang.Override
    public void speak() {

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
