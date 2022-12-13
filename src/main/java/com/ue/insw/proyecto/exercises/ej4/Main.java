package com.ue.insw.proyecto.exercises.ej4;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        HawaianPizza hawaian_pizza = new HawaianPizza("Pizza Hawaiana","Pan", Collections.singletonList("Mozzarella, Piña, Jamon"), new HornoLeñaBakeStyle());
        BarbecuePizza barbacue_pizza = new BarbecuePizza("Pizza Barbacoa","Fina",Collections.singletonList("Carne, Cebolla, Bacon, Salsa barbacoa"), new CalzonBakeStyle());
        CarbonaraPizza carbonara_pizza = new CarbonaraPizza("Pizza Carbonara","Tradicional",Collections.singletonList("Jamon, Champiñones, Cebolla"), new PocoHechaBakeStyle());

        hawaian_pizza.toString();
        barbacue_pizza.toString();
        carbonara_pizza.toString();

        hawaian_pizza.bake();
        System.out.println("");
        barbacue_pizza.bake();
        System.out.println("");
        carbonara_pizza.bake();
    }
}
