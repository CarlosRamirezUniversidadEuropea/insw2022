package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("persa", "Javier");
        cat.setEdad(3);
        cat.speak();
        System.out.println(cat);

        Dog dog = new Dog("Husky", "Kaiser");
        dog.setEdad(4);
        dog.speak();
        System.out.println(dog);

        Human human = new Human("Española", "Luis");
        human.setEdad(19);
        human.speak();
        System.out.println(human);
    }
}
