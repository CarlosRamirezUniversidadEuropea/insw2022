package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona("Mario Cabello", 23);
        System.out.println(person);

        Cliente client = new Cliente("Javier Vasquez", 28, "Coredev", 123456789);
        System.out.println(client);
        Cliente client1 = new Cliente("Adrian Gutierrez", 18, "Coredev", 987654321);
        System.out.println(client1);
        Cliente arrayCliente [] = {client, client1};

        Empleado empl = new Empleado("Luis Cubas", 19, 1000);
        System.out.println(empl);
        Empleado empl1 = new Empleado("Victor Lozano", 23, 3000);
        System.out.println(empl1);
        Empleado arrayEmpleado [] = {empl, empl1};

        Directivo directivo = new Directivo("Christian Yang", 25, 20000, "CEO");
        System.out.println(directivo);

        Empresa empresa = new Empresa("Coredev", arrayEmpleado, arrayCliente);
        System.out.println(empresa);
    }
}
