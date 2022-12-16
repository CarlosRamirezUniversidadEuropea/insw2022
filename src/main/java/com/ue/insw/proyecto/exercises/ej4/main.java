package com.ue.insw.proyecto.exercises.ej4;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        HawaianPizza HawaianPizza = new HawaianPizza(new CalzonBS());

        BarbecuePizza BarbecuePizza = new BarbecuePizza(new MuyHechaBS());
        CarbonaraPizza CarbonaraPizza = new CarbonaraPizza(new MuyHechaBS());


        HawaianPizza.toString();
        BarbecuePizza.toString();
        CarbonaraPizza.toString();

        HawaianPizza.bake();
        System.out.println("");
        BarbecuePizza.bake();
        System.out.println("");
        CarbonaraPizza.bake();

        System.out.println("FIN DEL PROGRAMA");
    }
}
