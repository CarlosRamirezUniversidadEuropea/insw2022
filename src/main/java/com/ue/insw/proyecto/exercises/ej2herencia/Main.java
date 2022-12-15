package com.ue.insw.proyecto.exercises.ej2herencia;



public class Main {

    public static void main(String[] args) throws Exception {

        Human humano=new Human("negra","paco",21);
        System.out.println(humano);
        humano.speak();

        Dog perro = new Dog("Pastor aleman", "Rex",5);
        System.out.println(perro);
        perro.speak();


        Cat gato = new Cat("Persa", "Don gato",2);
        System.out.println(gato);
        gato.speak();




    }


}