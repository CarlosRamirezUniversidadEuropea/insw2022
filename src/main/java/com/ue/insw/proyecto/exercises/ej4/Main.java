package com.ue.insw.proyecto.exercises.ej4;


public class Main {

    public static void main(String[] args){
        HawaianPizza hawaianPizza1= new HawaianPizza(new BakeStyleHornoElectrico());
        HawaianPizza hawaianPizza2= new HawaianPizza(new BakeStyleHornoCarbon());
        HawaianPizza hawaianPizza3= new HawaianPizza(new BakeStyleHornoLeña());

        hawaianPizza1.bake();
        hawaianPizza2.bake();
        hawaianPizza3.bake();

        CarbonaraPizza carbonaraPizza1=new CarbonaraPizza(new BakeStyleHornoElectrico());
        CarbonaraPizza carbonaraPizza2=new CarbonaraPizza(new BakeStyleHornoLeña());
        CarbonaraPizza carbonaraPizza3=new CarbonaraPizza(new BakeStyleHornoCarbon());

        carbonaraPizza1.bake();
        carbonaraPizza2.bake();
        carbonaraPizza3.bake();

        BarbecuePizza barbecuePizza1=new BarbecuePizza(new BakeStyleHornoElectrico());
        BarbecuePizza barbecuePizza2=new BarbecuePizza(new BakeStyleHornoElectrico());
        BarbecuePizza barbecuePizza3=new BarbecuePizza(new BakeStyleHornoElectrico());

        barbecuePizza1.bake();
        barbecuePizza2.bake();
        barbecuePizza3.bake();
    }
}
