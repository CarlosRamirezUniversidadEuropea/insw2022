package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }



    public void speak() {
        System.out.println("Guau");
    }

}
