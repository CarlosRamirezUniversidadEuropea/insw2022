package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    public Cat(String raza, String nombre) {
        super(raza, nombre);
    }
    @Override
    public String toString() {
        return "Gato: ";
    }

    public void speak() {
        System.out.println("Miaaaauuuu");
    }
}
