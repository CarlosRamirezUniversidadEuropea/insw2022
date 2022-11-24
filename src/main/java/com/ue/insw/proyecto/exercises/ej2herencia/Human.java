package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal{

    public Human(String raza, String nombre, int edad){
        super(raza, nombre, edad);
    }

    public void speak() {
        System.out.println("Hola");
    }
}
