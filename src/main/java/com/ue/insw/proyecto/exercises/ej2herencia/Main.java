package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main (String[] args) {
        Cat gato = new Cat("Gato persa", "Felix");
        System.out.println("Gato: " + gato);
        gato.speak();

        Dog perro = new Dog("Bulldog", "Pedro");
        System.out.println("Perro: " + perro);
        perro.speak();

        Human humana = new Human("Humana", "Carla");
        System.out.println("Humano: " + humana);
        humana.speak();
    }
}
