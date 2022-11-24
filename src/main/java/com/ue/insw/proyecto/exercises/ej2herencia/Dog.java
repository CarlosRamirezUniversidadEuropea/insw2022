package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre) {
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
        System.out.println("Guauf");
    }

    @Override
    public String toString() {
        return "Dog {" +
                "Raza=" + getRaza() +
                ", nombre=" + getNombre() +
                ", edad='" + getEdad() + '\'' +
                '}';
    }
    // todo complete extends Animal implements speak, override methods
}
