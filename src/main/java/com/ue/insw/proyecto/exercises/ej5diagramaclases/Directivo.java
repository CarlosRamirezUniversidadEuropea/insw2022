package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado{
    private String categoria;
    public Directivo(double sueldo_bruto, String categoria) {
        super(sueldo_bruto);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                '}';
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
