package com.ue.insw.proyecto.exercises.ej5diagramaclases;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        Persona persona = new Persona("Antonia", 43);
        Empleado empleado = new Empleado("Reid", 21, 15000);
        Cliente cliente = new Cliente("Bianca", 65, "Kleenex", "123456789");
        Directivo directivo = new Directivo("", 39, 18.90,"CEO");
        Empresa empresa = new Empresa("Google");

        persona.mostrar();
        System.out.println("");

        empleado.mostrar();
        System.out.println("Salario Neto: " +df.format(empleado.calcular_salario_neto()));

        cliente.mostrar();
        System.out.println("");

        directivo.mostrar();
    }
}
