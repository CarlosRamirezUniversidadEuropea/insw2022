package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    // todo complete extends Animal implements speak, override methods

    public Dog(String raza, String nombre) {
        super(raza, nombre);
    }


    @java.lang.Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }

    @java.lang.Override
    public String getNombre() {
        return super.getNombre();
    }

    @java.lang.Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @java.lang.Override
    public int getEdad() {
        return super.getEdad();
    }

    @java.lang.Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @java.lang.Override
    public void speak() {
        System.out.println("Guauu");
    }
    public String toString() {
        return "Cat{" +
                "Raza=" + getRaza() +
                ", nombre=" + getNombre() +
                ", edad='" + getEdad() + '\'' +
                '}';
    }


    }

