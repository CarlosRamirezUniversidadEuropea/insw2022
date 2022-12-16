package com.ue.insw.proyecto.exercises.ej5diagramaclases;


public class main {
    public static void main (String args[]){
        Persona persona=new Persona("Javier Rafael", 19);
        Empleado empleado=new Empleado("Sergio", 18, 10000);
        Cliente cliente= new Cliente("Pelayo", 21, "Microsoft", "679769769");
        Directivo directivo=new Directivo("Mario", 24, 40000, "Jefe");
        Empresa empresa= new Empresa("Microsoft");

        System.out.println("Persona:");
        System.out.println(persona.toString());
        System.out.println();

        System.out.println("Empleado:");
        System.out.println(empleado.toString());;
        System.out.println();

        System.out.println("Cliente");
        System.out.println(cliente.toString());;
        System.out.println();

        System.out.println("Directivo");
        System.out.println(directivo.toString());;
        System.out.println();

        System.out.println("Empresa");
        System.out.println(empresa.toString());;
        System.out.println();

        System.out.println("FIN DEL PROGRAMA");

    }
}
