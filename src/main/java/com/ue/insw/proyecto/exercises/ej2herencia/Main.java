package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String args[]){
        Cat gato = new Cat("Gato siamés", "Felix");
        System.out.println("El gato: " + gato);
        gato.speak();

        Dog perro = new Dog("Labrador", "Max");
        System.out.println("El perro: " + perro);
        perro.speak();

        Human humano = new Human("Humano", "Pepe");
        System.out.println("El humano: " + humano);
        humano.speak();
    }
}
