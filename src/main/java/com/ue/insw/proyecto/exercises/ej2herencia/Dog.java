package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak {
    // todo complete extends Animal implements speak, override methods
    private int edad;

    public Dog(String raza, String nombre, int edad){
        super(raza,nombre );
        this.edad=edad;

    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }


    public void speak() {
        System.out.println("uau-uau");

    }
}
}
