package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    private String firstName;
    private String lastName;
    private int edad;

    public Persona(String firstName,String lastName, int edad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", edad=" + edad +
                '}';
    }
}
