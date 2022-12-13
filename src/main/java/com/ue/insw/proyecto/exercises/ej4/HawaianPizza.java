package com.ue.insw.proyecto.exercises.ej4;

import java.util.ArrayList;
import java.util.Arrays;

//todo extends pizza
public class HawaianPizza extends Pizza{
    public HawaianPizza(BakeStyle bakeStyle){
        super("Fina", Arrays.asList("Tomate","Mozzarella","Piña","Cebolla"), bakeStyle, 22);
    }
}
