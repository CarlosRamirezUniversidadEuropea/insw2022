package com.ue.insw.proyecto.exercises.ej2herencia;

public class Animal implements Speak{

    private String raza;
    private String nombre;
    private int edad;

    public Animal(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws Exception {
        if(edad >= 0)
            this.edad = edad;
        else
            throw new Exception("Error establecida incorrecta.");
    }
    @Override
    public void speak() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }


}
