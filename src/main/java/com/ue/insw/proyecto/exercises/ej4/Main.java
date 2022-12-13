package com.ue.insw.proyecto.exercises.ej4;

public class Main {

    public static void main(String[] args) {

        HawaianPizza hawaiana1 = new HawaianPizza(new BakeStyleHornoLeña());
        HawaianPizza hawaiana2 = new HawaianPizza(new BakeStyleHornoCarbon());
        HawaianPizza hawaiana3 = new HawaianPizza(new BakeStyleHornoElectrico());
        hawaiana1.bake();
        hawaiana2.bake();
        hawaiana3.bake();
        CarbonaraPizza carbonaraPizza = new CarbonaraPizza(new BakeStyleHornoLeña());
        CarbonaraPizza carbonaraPizza2 = new CarbonaraPizza(new BakeStyleHornoCarbon());
        CarbonaraPizza carbonaraPizza3 = new CarbonaraPizza(new BakeStyleHornoElectrico());
        carbonaraPizza.bake();
        carbonaraPizza2.bake();
        carbonaraPizza3.bake();
    }
}
