package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {
    private int edad;
    private String nombre;


    public Human (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;

    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }


    public void speak() {

    }
}
}
