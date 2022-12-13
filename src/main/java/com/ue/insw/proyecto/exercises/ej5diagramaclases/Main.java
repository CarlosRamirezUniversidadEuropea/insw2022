package com.ue.insw.proyecto.exercises.ej5diagramaclases;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main (String[]args){
        Empleado empleado= new Empleado(2500.0 ,"moha", 23);
        Cliente cliente = new Cliente("Mohamed",20,"Ali",633717661);
        List<Empleado> empleados = Arrays.asList(empleado);
        List<Cliente> clientes = Arrays.asList(cliente);

        Empresa empresa = new Empresa("Mcode",empleados,clientes);

        Directivo directivo= new Directivo(4,30000,"manuel",38);
        Directivo directivo2= new Directivo(9,80000,"Martinez",57);

        empleado.mostrar();

    }
}
