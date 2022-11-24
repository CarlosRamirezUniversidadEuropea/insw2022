package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("persa", "Javier");
        cat.setEdad(3);
        System.out.println(cat);

        Dog dog = new Dog("Husky", "Kaiser");
        cat.setEdad(4);
        System.out.println(dog);

        Human human = new Human("Española", "Luis");
        cat.setEdad(19);
        System.out.println(human);
    }
}
