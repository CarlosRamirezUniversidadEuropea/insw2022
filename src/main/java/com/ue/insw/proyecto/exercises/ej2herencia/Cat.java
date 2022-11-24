package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal{
    // todo extends Animal implements speak, override methods

    public Cat(String raza, String nombre, int edad){
        super(raza, nombre, edad);
    }

    public void speak() {
        System.out.println("Meow");
    }
}
