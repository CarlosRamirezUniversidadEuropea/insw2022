package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {

    public static void main (String[] args) {
        Empresa Endesa = new Empresa("Endesa");
        Empleado Empleado1 = new Empleado("Juan", 21, 55000);
        Empleado Empleado2 = new Empleado("Diego", 35, 60000);
        Empleado Empleado3 = new Empleado("Paco", 27, 57000);
        Empleado Empleado4 = new Empleado("Daniel", 21, 65000);
        Directivo Directivo1 = new Directivo("Pedro", 45, 70000, "RRHH");
        Cliente Cliente1 = new Cliente("Eduardo", 19, "Endesa", "+34 91234245");
        Cliente Cliente2 = new Cliente("Eduardo", 34, "Endesa", "+34 91568449");
        Cliente Cliente3 = new Cliente("Eduardo", 29, "Endesa", "+34 91234678");

        System.out.println("\n----------NOMBRE DE LA EMPRESA------------");
        System.out.println("\nEMPRESA: "+ Endesa.getNombre());
        System.out.println("\n----------LISTADO DE EMPLEADOS------------");
        System.out.println("\nEMPLEADO 1");
        Empleado1.mostrar();
        Empleado1.calcular_salario_neto();
        System.out.println("\nEMPLEADO 2");
        Empleado2.mostrar();
        Empleado2.calcular_salario_neto();
        System.out.println("\nEMPLEADO 3");
        Empleado3.mostrar();
        Empleado3.calcular_salario_neto();
        System.out.println("\nEMPLEADO 4");
        Empleado4.mostrar();
        Empleado4.calcular_salario_neto();
        System.out.println("\n----------LISTADO DE DIRECTIVOS------------");
        System.out.println("\nDIRECTIVO");
        Directivo1.mostrar();
        Directivo1.calcular_salario_neto();
        System.out.println("\n----------LISTADO DE CLIENTES------------");
        System.out.println("\nCLIENTE 1");
        Cliente1.mostrar();
        System.out.println("\nCLIENTE 2");
        Cliente2.mostrar();
        System.out.println("\nCLIENTE 3");
        Cliente3.mostrar();





    }
}

