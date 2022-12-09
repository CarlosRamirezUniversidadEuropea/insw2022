package com.ue.insw.proyecto.exercises.ej4;

public class TradicionalBakeStyle extends BakeStyle {

    public void bake(Pizza pizza) {
        int tipo=0;

        System.out.println("La pizza se cocinara al mas puro estilo tradicional: " + pizza.toString());

        System.out.println("Que tipo de masa quiere utilizar para la pizza?");
        System.out.println("1- Masa Madre ");
        System.out.println("2- Masa Fina ");
        System.out.println("3- Masa Tradicional ");

        if(tipo == 1) {
            System.out.println("Ha elegido MASA MADRE. ");
        }
        if(tipo==2){
            System.out.println("Ha elegido MASA FINA. ");
        }
        if(tipo==3){
            System.out.println("Ha elegido MASA TRADICIONAL. ");
        }
    }

    public String toString () {
        return "TradicionalBakeStyle";
    }

}

