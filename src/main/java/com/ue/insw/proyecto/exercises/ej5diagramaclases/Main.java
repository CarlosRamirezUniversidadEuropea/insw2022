package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[]args){
       Empleado empleado=new Empleado(25000, "Lara", 23);
       Cliente cliente=new Cliente("Alvaro", 20,"Antamina",265623100);
       List<Empleado> empleados= Arrays.asList(empleado);
       List<Cliente> clientes= Arrays.asList(cliente);

       Empresa empresa=new Empresa("Elefante",empleados,clientes);



       Directivo directivo=new Directivo(5,26000,"Jose",26);
       Directivo directivo1=new Directivo(1,35000,"Juan",56);
    }
}








