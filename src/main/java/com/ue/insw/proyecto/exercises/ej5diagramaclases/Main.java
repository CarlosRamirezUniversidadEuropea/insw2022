package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(20);
        persona.mostrar();

        Cliente cliente = new Cliente(25, "Nombre 1", "Telefono 1");
        cliente.mostrar();

        Directivo directivo = new Directivo(30, 3000.0, "Categoria 1");
        directivo.mostrar();

        Empleado empleado = new Empleado(27, 1500.0);
        empleado.mostrar();
        empleado.calcular_salario_neto();

        Empresa empresa = new Empresa("Nombre 2", Arrays.asList(cliente), Arrays.asList(empleado));
    }
}