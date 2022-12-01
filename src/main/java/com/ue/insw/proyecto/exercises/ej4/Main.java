package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String args[]){




        HawaianPizza hawuai=new HawaianPizza(new HronoLeñaBakeStyle());
        hawuai.bake();
        CarbonaraPizza carbonara=new CarbonaraPizza(new CalzoneBakeStyle());
        carbonara.bake();
        BarbecuePizza barbacoa=new BarbecuePizza(new PocoHechaBakeStyle());
        barbacoa.bake();
    }
}
