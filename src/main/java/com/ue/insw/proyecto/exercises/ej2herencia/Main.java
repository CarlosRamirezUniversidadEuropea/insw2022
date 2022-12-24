package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {
    public static void main(String[] args) throws Exception {
      Cat siameses= new Cat("siameses","juan",12);
      System.out.println("El nombre del gato es: "+siameses.getNombre());
      System.out.println("La edad del gato es: "+ siameses.getEdad());
      System.out.println("La raza del gato es: "+siameses.getRaza());
      siameses.speak();

      Dog coocker =new Dog("coocker","Doky",8);
      System.out.println("El nombre del perro es: "+coocker.getNombre());
      System.out.println("La edad del perro es: "+ coocker.getEdad());
      System.out.println("La raza del perro es: "+coocker.getRaza());
      coocker.speak();

      Human alvaro=new Human("ALvaro",20,"mestizo");
      System.out.println("El nombre del humano es: "+alvaro.getNombre());
      System.out.println("La edad del humano es: "+ alvaro.getEdad());
      System.out.println("La raza del human es: "+alvaro.getRaza());
      alvaro.speak();

;

    }

}
