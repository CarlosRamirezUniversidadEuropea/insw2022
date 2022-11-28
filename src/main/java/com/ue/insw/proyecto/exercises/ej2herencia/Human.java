package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {

    public Human(String raza, String nombre,int edad){
        super(raza,nombre,edad);

    }

    public String toString(){
        try {
            return "Humano{ Nombre= " + getNombre() + ", Raza= " + getRaza() + ", Edad= "+getEdad()+"}";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void speak() {
        System.out.println("Hola mundo");
    }

}
