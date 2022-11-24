package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main (String[] args) {

        Cat gato = new Cat ("Persa", "Gatito");
        Dog perro = new Dog ("Labrador", "Petr");
        Human humano = new Human ("Humano", "Pablo");
        gato.speak();
        perro.speak();
        humano.speak();

    }
}
