package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak {
    // todo extends Animal implements speak, override methods

    public Cat (String raza, String nombre){
        super (raza, nombre);

    }
    public void speak(){
        System.out.println(" miauuu");
    }
}
