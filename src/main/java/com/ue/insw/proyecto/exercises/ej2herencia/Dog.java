package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal {
    public Dog(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public String toString() {
        return "Dog{ " + getNombre() + ", " + getRaza() + " }";
    }

    @Override
    public void speak() {
        System.out.println("Guau");
    }
    // todo complete extends Animal implements speak, override methods
}
