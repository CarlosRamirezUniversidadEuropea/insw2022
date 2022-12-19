package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void Main(String arg[]) {
        Persona persona=new Persona("Mario", "Redondo", 19);
        Empleado empleado=new Empleado("Adrian", "Redondo", 10);
        Cliente cliente=new Cliente("Daniela", "Redondo", 5, "Bankinter", 647356877);
        Directivo directivo=new Directivo("Luis", "Cursitos", 3, "Pelandusca");
        Empresa empresa=new Empresa("Windows");

        System.out.println(persona.toString());
        System.out.println(empleado.toString());
        System.out.println(cliente.toString());
        System.out.println(directivo.toString());
        System.out.println(empresa.toString());
    }
}
