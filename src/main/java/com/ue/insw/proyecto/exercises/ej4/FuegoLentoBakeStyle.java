package com.ue.insw.proyecto.exercises.ej4;

public class FuegoLentoBakeStyle extends BakeStyle {

    public void bake(Pizza pizza) {

        System.out.println("La pizza se cocinara a fuego lento: " + pizza.toString());

        int aniadirSalsa;
        int temperatura=0;
        int tiempo=0; //en minutos
        if(temperatura==50){
            System.out.println("Es el momento optimo para cocinar la pizza. ");
        }else{
            System.out.println("El horno no ha alcanzado la suficiente temperatura para cocinar la pizza. ");
        }
        if(temperatura>60){
            System.out.println("La pizza podria concinarse en exceso y quemarse rapidamente. ");

        if(tiempo<10 && tiempo>5){
            System.out.println("Es el momento optimo para añadir la salsa junto con el queso si quiere sacar el mayor provecho al sabor. ");
        }else{
            System.out.println("No es recomendable añadir ahora las salsas y el queso. Tal vez sea muy pronto o muy tarde para sacar rpovacho a todos sus ingredientes. ");
        }

        }
    }

    public String toString () {
        return "FuegoLentoBakeStyle";
    }

}

