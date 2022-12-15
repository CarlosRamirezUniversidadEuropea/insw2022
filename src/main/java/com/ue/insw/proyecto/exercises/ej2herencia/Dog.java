package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    // todo complete extends Animal implements speak, override methods
    public Dog(String raza, String nombre,int edad){
        super(raza,nombre,edad);
    }

    public String toString(){
        try {
            return "Perro{ Nombre= " + getNombre() + ", Raza= " + getRaza() + ", Edad= "+getEdad()+"}";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override

    public void speak(){
        System.out.println("GUAU");
    }


}