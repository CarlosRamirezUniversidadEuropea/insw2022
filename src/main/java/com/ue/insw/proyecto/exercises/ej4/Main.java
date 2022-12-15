package com.ue.insw.proyecto.exercises.ej4;

public class Main {

    public static void main(String arg []) {
        HawaianPizza hawayana1 = new HawaianPizza(new CalzoneBakeStyle());
        hawayana1.bake();
        CarbonaraPizza carbonara1 = new CarbonaraPizza(new HornoLeñaBakeStyle());
        carbonara1.bake();
        BarbecuePizza barbacoa1 = new BarbecuePizza(new PocoHechoBakeStyle());
    }
}
