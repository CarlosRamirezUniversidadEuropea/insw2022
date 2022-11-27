package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    private int edad;
    private String raza;
    private String nombre;

    public Dog(String raza, String nombre) {
        super(raza, nombre);
        this.edad=5;
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
        System.out.println("Waof Waof");
    }
    @Override
    public String toString(){
        return "Dog{ "+
                "Raza: "+raza +
                ", Nombre: "+nombre +
                ", Edad: "+ edad +
                "}";
    }
    // todo complete extends Animal implements speak, override methods

}
