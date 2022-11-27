package com.ue.insw.proyecto.exercises.ej2herencia;

public class main {
    public static void main(String args[]){
        Cat cat = new Cat("Gato siamés", "Felix");
        System.out.println("El gato: " + cat);
        cat.speak();

        Dog dog = new Dog("Labrador", "Max");
        System.out.println("El perro: " + dog);
        dog.speak();

        Human human = new Human("Humano", "Pepe");
        System.out.println("El humano: " + human);
        human.speak();
    }
}