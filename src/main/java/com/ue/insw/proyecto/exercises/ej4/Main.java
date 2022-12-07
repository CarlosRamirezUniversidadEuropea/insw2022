package com.ue.insw.proyecto.exercises.ej4;



public class Main {
    public static void main (String[]args){
        HawaianPizza hawaianPizza1= new HawaianPizza(new TipoCocinadoHornoCarbon());
        HawaianPizza hawaianPizza2 = new HawaianPizza(new TipoCocinadoHornoLeña());
        HawaianPizza hawaianPizza3= new HawaianPizza(new TipoCocinadoHornoElectrico());

        hawaianPizza1.cocinar();
        hawaianPizza2.cocinar();
        hawaianPizza3.cocinar();

        CarbonaraPizza carbonaraPizza1=new CarbonaraPizza(new TipoCocinadoHornoElectrico());
        CarbonaraPizza carbonaraPizza2= new CarbonaraPizza(new TipoCocinadoHornoLeña());
        CarbonaraPizza carbonaraPizza3=new CarbonaraPizza(new TipoCocinadoHornoCarbon());

        carbonaraPizza1.cocinar();
        carbonaraPizza2.cocinar();
        carbonaraPizza3.cocinar();

        BarbecuePizza barbecuePizza1 =new BarbecuePizza(new TipoCocinadoHornoCarbon());
        BarbecuePizza barbecuePizza2=new BarbecuePizza(new TipoCocinadoHornoLeña());
        BarbecuePizza barbecuePizza3=new BarbecuePizza(new TipoCocinadoHornoElectrico());

        barbecuePizza1.cocinar();
        barbecuePizza2.cocinar();
        barbecuePizza3.cocinar();

    }
}
