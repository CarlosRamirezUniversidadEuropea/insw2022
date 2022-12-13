package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends  Empleado {
    private String categoria;

    public Directivo(int Edad, double Sueldo_bruto, String Categoria) {
        super(Edad, Sueldo_bruto);
        this.categoria = Categoria;
    }

    public void mostrar() {
        System.out.println("Categoria: " + categoria);
    }
}
