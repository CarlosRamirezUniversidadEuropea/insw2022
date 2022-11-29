package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Gato pardo", "Fer");
        System.out.println("Gato: " + cat1);
        cat1.speak();

        Dog dog1 = new Dog("Bulldog", "Pipo");
        System.out.println("Perro: " + dog1);
        dog1.speak();

        Human human1 = new Human("negro", "Javier");
        System.out.println("Human: " +human1);
        human1.speak();
    }
}
