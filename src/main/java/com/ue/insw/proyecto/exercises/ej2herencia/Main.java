package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args){
        Human human= new Human("Humano","Ricardo");
        System.out.println(human.getRaza());
        System.out.println(human.getNombre());
        System.out.println(human.toString());
        human.speak();

        Dog dog= new Dog("Perro","Sparky");
        System.out.println(dog.getRaza());
        System.out.println(dog.getNombre());
        System.out.println(dog.toString());
        dog.speak();

        Cat cat= new Cat("Gato","Michi");
        System.out.println(cat.getRaza());
        System.out.println(cat.getNombre());
        System.out.println(cat.toString());
        cat.speak();

    }
}
