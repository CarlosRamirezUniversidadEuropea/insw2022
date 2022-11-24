package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    public Cat(String raza, String nombre) {
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
        System.out.println("Miow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Raza=" + getRaza() +
                ", nombre=" + getNombre() +
                ", edad='" + getEdad() + '\'' +
                '}';
    }

    // todo extends Animal implements speak, override methods
}
