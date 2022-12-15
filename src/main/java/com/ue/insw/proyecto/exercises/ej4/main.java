package com.ue.insw.proyecto.exercises.ej4;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        HawaianPizza HawaianPizza = new HawaianPizza( "Borde de queso", Collections.singletonList("Mozzarella, Piña, Jamon"), new HornoLeñaBS());
        BarbecuePizza BarbecuePizza = new BarbecuePizza( "Fina", Collections.singletonList("Carne, Cebolla, Bacon, Salsa barbacoa"), new CalzonBS());
        CarbonaraPizza CarbonaraPizza = new CarbonaraPizza("Tradicional", Collections.singletonList("Jamon, Champiñones, Cebolla"), new MuyHechaBS());


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
