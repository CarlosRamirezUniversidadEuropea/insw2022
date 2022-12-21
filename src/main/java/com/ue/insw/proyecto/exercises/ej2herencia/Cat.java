package com.ue.insw.proyecto.exercises.ej2herencia;
import java.util.jar.Attributes;


public class Cat extends Animal implements Speak{
    // todo extends Animal implements speak, override methods

    private int edad;

    public Cat(String raza, String nombre, int edad){
        super(raza,nombre );
        this.edad=edad;

    }



    @Override
    public void speak() {
        System.out.println("miau-miau");

    }



}
