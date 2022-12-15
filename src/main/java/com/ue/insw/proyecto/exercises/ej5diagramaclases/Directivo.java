package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.Arrays;

public class Directivo extends Empleado{

    private String categoria;
    private Empleado suborninados[];

    public Directivo(String nombre, int edad, int sueldo_bruto, String categoria, Empleado[] suborninados) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
        this.suborninados = suborninados;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                ", suborninados=" + Arrays.toString(suborninados) +
                '}';
    }
}
