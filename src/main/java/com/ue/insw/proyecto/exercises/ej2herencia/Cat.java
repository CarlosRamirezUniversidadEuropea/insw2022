package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    public Cat(String raza, String nombre) {
        super(raza, nombre);
    }

public String toString() {
    return "Cat{ " + getNombre() + getRaza() + " }";
}

    @Override
    public void speak() {
        System.out.println("Miau");
    }
}