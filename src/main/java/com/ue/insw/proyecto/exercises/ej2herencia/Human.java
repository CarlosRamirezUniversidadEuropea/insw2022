package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {

    public Human(String edad, String nombre) {
        super(edad, nombre);
    }

    public String toString() {
        return "Human()" + getNombre() + getEdad();
    }

    public void Speak() {
        System.out.println("Soy un ser humano");
    }
}
