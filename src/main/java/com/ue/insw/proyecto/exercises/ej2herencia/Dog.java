package com.ue.insw.proyecto.exercises.ej2herencia;

import javax.print.DocFlavor;
import java.lang.ref.SoftReference;

public class Dog extends Animal implements Speak {
    // todo complete extends Animal implements speak, override methods



    public Dog(String raza, String nombre,int edad){
        super(raza,nombre,edad );


    }



    @Override
    public void speak() {
        System.out.println("El perro dice: uau-uau");

    }



}
