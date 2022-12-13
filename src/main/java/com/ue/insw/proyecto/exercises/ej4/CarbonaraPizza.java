package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;

//todo extends pizza
public class CarbonaraPizza extends Pizza {
    public CarbonaraPizza(BakeStyle bakeStyle){
        super("normal", Arrays.asList("Tomate","Mozzarella","cebolla"),bakeStyle, 8);
    }

}
