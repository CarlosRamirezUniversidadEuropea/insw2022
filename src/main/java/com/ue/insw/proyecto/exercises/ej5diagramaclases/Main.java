package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Main {
    public static void main (String[]args){
       Empleado empleado=new Empleado(25000, "Lara", 23);
       Empleado empleado1= new Empleado(29000,"Apple", 56);

       Cliente cliente=new Cliente("Alvaro", 20,"Antamina",265623100);
       Cliente cliente1=new Cliente("Gerardo",40,"Socavon", 236100555);

       Directivo directivo=new Directivo(5,26000,"Jose",26);
       Directivo directivo1=new Directivo(1,35000,"Juan",56);

    }
}








