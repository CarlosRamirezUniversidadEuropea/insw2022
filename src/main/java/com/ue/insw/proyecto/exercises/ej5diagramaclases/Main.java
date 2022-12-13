package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    public static void main (String[]args){
        Cliente cliente=new Cliente("Julian", 32,"Intel",605848302);
        Empleado empleado=new Empleado("Adrian", 19, 26000);
        Directivo directivo=new Directivo("Juan Roig",59,1000000,40);
        Empresa empresa=new Empresa("Intel",cliente,empleado);





    }
}
