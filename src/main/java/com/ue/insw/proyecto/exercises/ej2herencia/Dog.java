package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak {
    // todo complete extends Animal implements speak, override methods

    public Dog (String raza, String nombre){
        super(raza,nombre);
    }
    public void Speak() {
        System.out.println("wau wau");
    }
}
