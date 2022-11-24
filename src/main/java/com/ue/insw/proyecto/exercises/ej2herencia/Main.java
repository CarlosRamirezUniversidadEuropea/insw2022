package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String args[]){
      Cat cat=new Cat("BELIER","Romano");
      Dog dog=new Dog("Haski","Leo");
      Human human=new Human("Blanco","Pepe");
      cat.speak();
      dog.speak();
      human.speak();
    }
}
