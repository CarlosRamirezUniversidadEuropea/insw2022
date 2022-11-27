package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{

    private int edad;
    private String raza;
    private String nombre;

    public Human(String raza, String nombre) {
        super(raza, nombre);
        this.edad=15;
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
        System.out.println("Hola");
    }
    @Override
    public String toString(){
        return "Humano{ "+
                "Raza: "+raza +
                ", Nombre: "+nombre +
                ", Edad: "+ edad +
                "}";
    }
}
