package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    // todo extends Animal implements speak, override methods


    public Cat(String raza, String nombre) {
        super(raza, nombre);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void speak() {
        System.out.println("miau");

    }
}
