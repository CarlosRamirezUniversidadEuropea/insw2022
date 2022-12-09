package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado{
    private String nombre_de_directivo;
    private int categoria;

    public Directivo(int categoria,String nombre_de_directivo, double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.nombre_de_directivo=nombre_de_directivo;
        this.categoria=categoria;

    }

    public String getNombre_de_directivo() {
        return nombre_de_directivo;
    }

    public void setNombre_de_directivo(String nombre_de_directivo) {
        this.nombre_de_directivo = nombre_de_directivo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
