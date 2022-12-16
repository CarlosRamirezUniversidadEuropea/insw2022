package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class persona {
     private String nombre;
     private int edad;
     private int DNI;

     private String genero;
     private String categoria;

     public void mostrar(){

         System.out.println("El nombre de la persona es " + nombre);
         System.out.println("La edad de la persona es " + edad);
         System.out.println("El DNI de la persona es " + DNI);
         System.out.println("El genero de la persona es " + genero);
         System.out.println("La categoría de la persona es " + categoria);

     }
}
