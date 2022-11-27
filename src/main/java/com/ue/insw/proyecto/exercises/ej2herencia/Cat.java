package com.ue.insw.proyecto.exercises.ej2herencia;

import java.util.jar.Attributes;

public class Cat extends Animal implements Speak {


    private int edad;
    private String raza;
    private String nombre;

    public Cat(String raza, String nombre) {
        super(raza, nombre);
        this.edad=4;
        this.raza=raza;
        this.nombre=nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
    @Override
    public String toString(){
        return "Gato{ "+
                "Raza: "+raza +
                ", Nombre: "+nombre +
                ", Edad: "+ edad +
                "}";
    }
}
