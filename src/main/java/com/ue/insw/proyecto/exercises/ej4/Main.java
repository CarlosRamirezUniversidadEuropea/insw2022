package com.ue.insw.proyecto.exercises.ej4;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        HawaianPizza hawaian_pizza = new HawaianPizza("Pan", Collections.singletonList("Mozzarella, Piña, Jamon"), new HornoLeñaBakeStyle());
        BarbecuePizza barbacue_pizza = new BarbecuePizza("Fina",Collections.singletonList("Carne, Cebolla, Bacon, Salsa barbacoa"), new CalzonBakeStyle());
        CarbonaraPizza carbonara_pizza = new CarbonaraPizza("Tradicional",Collections.singletonList("Jamon, Champiñones, Cebolla"), new PocoHechaBakeStyle());
    }
}
