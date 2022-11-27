package com.ue.insw.proyecto.exercises.ej2herencia;

public class Human extends Animal implements Speak{

    public Human(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public String toString() {
        return "Humano: ";
    }

    @Override
    public void speak() {
        System.out.println("Señores hay mundial");
    }
}