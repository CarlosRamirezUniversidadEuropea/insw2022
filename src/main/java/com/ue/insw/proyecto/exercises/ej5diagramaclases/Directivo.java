package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado {
    String categoria;

    public Directivo(String nombre, int edad, float sueldo_bruto, String categoria) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Categoría: "+categoria);
    }
}
