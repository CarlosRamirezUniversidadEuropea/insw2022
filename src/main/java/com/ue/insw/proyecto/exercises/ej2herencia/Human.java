package com.ue.insw.proyecto.exercises.ej2herencia;

public class Human extends Animal{

    public Human(String raza, String nombre, int edad){
        super(raza, nombre, edad);
    }

    public void speak() {
        System.out.println("Hola");
    }
}
