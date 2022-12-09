package com.ue.insw.proyecto.exercises.ej4;

public class Main {


    public static void main(String[] args){
        HawaianPizza hawaianPizza = new HawaianPizza(new HornoLenaBakeStyle());
        hawaianPizza.bake();
        CarbonaraPizza carbonaraPizza = new CarbonaraPizza(new HornoLenaBakeStyle());
        carbonaraPizza.bake();
        BarbecuePizza barbecuePizza = new BarbecuePizza(new HornoLenaBakeStyle());
        barbecuePizza.bake();
        MargaritaPizza margaritaPizza = new MargaritaPizza(new HornoLenaBakeStyle());
        margaritaPizza.bake();

        HawaianPizza hawaianPizza1 = new HawaianPizza(new CalzoneBakeStyle());
        hawaianPizza1.bake();
        CarbonaraPizza carbonaraPizza1 = new CarbonaraPizza(new CalzoneBakeStyle());
        carbonaraPizza1.bake();
        BarbecuePizza barbecuePizza1 = new BarbecuePizza(new CalzoneBakeStyle());
        barbecuePizza1.bake();
        MargaritaPizza margaritaPizza1 = new MargaritaPizza(new CalzoneBakeStyle());
        margaritaPizza1.bake();

        HawaianPizza hawaianPizza2 = new HawaianPizza(new FuegoLentoBakeStyle());
        hawaianPizza2.bake();
        CarbonaraPizza carbonaraPizza2 = new CarbonaraPizza(new FuegoLentoBakeStyle());
        carbonaraPizza2.bake();
        BarbecuePizza barbecuePizza2 = new BarbecuePizza(new FuegoLentoBakeStyle());
        barbecuePizza2.bake();
        MargaritaPizza margaritaPizza2 = new MargaritaPizza(new FuegoLentoBakeStyle());
        margaritaPizza2.bake();

        HawaianPizza hawaianPizza3 = new HawaianPizza(new TradicionalBakeStyle());
        hawaianPizza3.bake();
        CarbonaraPizza carbonaraPizza3 = new CarbonaraPizza(new TradicionalBakeStyle());
        carbonaraPizza3.bake();
        BarbecuePizza barbecuePizza3 = new BarbecuePizza(new TradicionalBakeStyle());
        barbecuePizza3.bake();
        MargaritaPizza margaritaPizza3 = new MargaritaPizza(new TradicionalBakeStyle());
        margaritaPizza3.bake();
    }
}