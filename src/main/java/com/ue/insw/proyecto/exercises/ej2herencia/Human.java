package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{

    public Human(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public void speak() {
        System.out.println("Hola");
    }
}
