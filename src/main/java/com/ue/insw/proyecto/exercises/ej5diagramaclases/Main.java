package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    public static void main (String[]args){
        Cliente cliente=new Cliente("Pepe", 56,"Eco Recuperaciones",000000000);
        Empleado empleado=new Empleado("Manuel Araújo", 21, 23000);
        Directivo directivo=new Directivo("Julian Araújo",55,40000,0);
        Empresa empresa=new Empresa("Eco recuperaciones",cliente,empleado);

        System.out.println(cliente.toString());
        System.out.println(empleado.toString());
        System.out.println(directivo.toString());
        System.out.println(empresa.toString());
        System.out.println();

    }
}