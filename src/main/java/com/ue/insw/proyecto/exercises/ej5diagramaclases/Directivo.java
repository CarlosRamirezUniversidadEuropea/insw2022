package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado {
    int categoria;

    public Directivo(String nombre, int edad, double sueldo_bruto, int categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    public double Neto() {
        return sueldo_bruto-(0.25*sueldo_bruto);
    }


    public String toString() {
        return "Directivo{" + "categoria=" + categoria +", nombre= "+ nombre + ", edad= "+ edad + ", sueldo neto= "+ Neto() +'}';
    }
}