package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Naranja","Oui", 4);
        Dog dog = new Dog("Shiba Inu","Dorado", 2);
        Human human = new Human("","", 21);

        cat.speak();
        System.out.println("La edad del gato: " +cat.getEdad());

        dog.speak();
        System.out.println("Edad del perro: " + dog.getEdad());

        human.speak();
        System.out.println("Edad del humano es: " +human.getEdad());
    }
}
