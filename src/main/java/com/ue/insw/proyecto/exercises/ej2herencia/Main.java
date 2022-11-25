package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {

    private static String raza;
    private static String nombre;
    private static String idioma;
    private static String genero;
    private static String habitat;
    private static int edad;
    private static String mascota;

    public static void Main(String[] args){
        Cat cat = new Cat(raza, nombre, idioma, genero, habitat, edad);
        System.out.println("Raza: ");
        System.out.println("Nombre: ");
        System.out.println("Idioma: ");
        System.out.println("Genero: ");
        System.out.println("Habitat: ");
        System.out.println("Edad: ");

        Dog dog = new Dog(raza, nombre, idioma, genero, habitat, edad, mascota);
        System.out.println("Raza: ");
        System.out.println("Nombre: ");
        System.out.println("Idioma: ");
        System.out.println("Genero: ");
        System.out.println("Habitat: ");
        System.out.println("Edad: ");
        System.out.println("Es una mascota? ");

        Human human = new Human(raza, nombre, idioma, genero, edad);
        System.out.println("Raza: Humana ");
        System.out.println("Nombre: Pepe ");
        System.out.println("Idioma: Español");
        System.out.println("Genero: Hombre ");
        System.out.println("Edad: 32 ");


    }
}








