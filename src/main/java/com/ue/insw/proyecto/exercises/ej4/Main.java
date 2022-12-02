package com.ue.insw.proyecto.exercises.ej4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BarbecuePizza pizza = new BarbecuePizza(new BakeNormal());
        pizza.bake();

        HawaianPizza pizza1 = new HawaianPizza(new BakeCalzone());
        pizza1.bake();

        CarbonaraPizza pizza2 = new CarbonaraPizza(new BakeChicago());
        pizza2.bake();

    }

}
