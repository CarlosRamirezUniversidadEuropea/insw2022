package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) {
       Human human = new Human("Juan",56,"humano");
       System.out.println(human.getRaza());
       System.out.println(human.getNombre());
       System.out.println(human.toString());
           human.speak();


       Dog dog= new Dog ("cocker", "Doky", 6);
       System.out.println(dog.getRaza());
       System.out.println(dog.getNombre());
       System.out.println(dog.toString());
            dog.speak();


        Cat cat= new Cat("angora","Lucas", 6);
        System.out.println(cat.getRaza());
        System.out.println(cat.getNombre());
        System.out.println(cat.toString());
            cat.speak();

    }

}
