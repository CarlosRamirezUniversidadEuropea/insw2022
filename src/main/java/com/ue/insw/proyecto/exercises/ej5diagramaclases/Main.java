package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mario Gutiérrrez",19);

        Cliente cliente1 = new Cliente("Pepe Sánchez",32,"Universidad Europea",603868192);
        Cliente cliente2 = new Cliente("Lucía Buenafuente", 30,"Universidad Europea",683182302);

        Empleado empleado1 = new Empleado("Jose Jimenez", 45,2500);
        Empleado empleado2 = new Empleado("María López", 30, 2500);

        Empleado arrayEmpleados[] = {empleado1, empleado2}; //Utilizado para el constructor de abajo
        Cliente arrayClientes[] = {cliente1, cliente2};

        Directivo directivo = new Directivo("Carla Sánchez", 40, 3500, "Recursos humanos", arrayEmpleados);

        Empresa empresa = new Empresa("Universidad Europea",arrayEmpleados, arrayClientes);

        cliente1.mostrar();
        cliente2.mostrar();

        empleado1.mostrar();
        empleado2.mostrar();

        directivo.mostrar();
    }
}
