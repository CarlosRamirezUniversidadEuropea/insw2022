package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
        Dog perro = new Dog("Pomerania", "Theo");
        perro.speak();

        Cat gato = new Cat("Persa", "Tarantino");
        gato.speak();

        Human humano = new Human("Blanco", "Santiago");
        humano.speak();
    }
}
