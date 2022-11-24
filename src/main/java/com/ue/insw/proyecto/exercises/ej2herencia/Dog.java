package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{

    // todo complete extends Animal implements speak, override methods
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    public void speak() {
        System.out.println("Woof");
    }

}
