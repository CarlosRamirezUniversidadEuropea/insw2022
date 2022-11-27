package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    @Override
    public void speak() {
        System.out.println("guau guau");
    }
}
