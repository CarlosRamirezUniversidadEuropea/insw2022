package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
        Cat gato = new Cat("Gato bambino", "Michi");
        System.out.println("Gato: " + gato);
        gato.speak();

        Dog perro = new Dog("Bichón maltés", "Federico");
        System.out.println("Perro: " + perro);
        perro.speak();

        Human humano = new Human("Humano", "Finn");
        System.out.println("Humano:" + humano);
        humano.speak();
    }
}
