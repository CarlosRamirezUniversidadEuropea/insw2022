package com.ue.insw.proyecto.exercises.ej4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{

    public HawaianPizza(BakeStyle bakeStyle) {
        super("Fina", Arrays.asList("Jamon", "Mozarella", "Tomate", "Piña"), bakeStyle);
    }
}
