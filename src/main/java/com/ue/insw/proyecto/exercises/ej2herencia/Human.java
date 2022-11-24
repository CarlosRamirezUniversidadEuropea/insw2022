package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{
    public Human(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void speak() {
        System.out.println("Hola");
    }

    @Override
    public String toString() {
        return "Human {" +
                "Raza=" + getRaza() +
                ", nombre=" + getNombre() +
                ", edad='" + getEdad() + '\'' +
                '}';
    }
}
