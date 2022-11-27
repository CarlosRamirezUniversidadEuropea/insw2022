package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void Main(String args[]){
        Cat cat = new Cat("ragdoll", "Mario");
        System.out.println("El gato: " + cat);
        cat.speak();

        Dog dog = new Dog("bulldog", "Juanfran");
        System.out.println("El perro: " + dog);
        dog.speak();

        Human human = new Human("Humano", "Juan");
        System.out.println("El humano: " + human);
        human.speak();
    }
}