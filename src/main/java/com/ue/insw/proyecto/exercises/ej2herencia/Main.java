package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Russian Blue","Loki", 5);
        Dog dog = new Dog("Pastor Aleman","Thor", 8);
        Human human = new Human("","", 25);

        cat.speak();
        System.out.println("La edad del gato es: " +cat.getEdad());

        System.out.println("");

        dog.speak();
        System.out.println("La edad del perro es: " +dog.getEdad());

        System.out.println("");

        human.speak();
        System.out.println("La edad del humano es: " +human.getEdad());
    }
}
