package com.ue.insw.proyecto.exercises.ej4;

//todo extends pizza


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BarbecuePizza extends Pizza{

    private BakeStyle bakestyle;
    public BarbecuePizza(BakeStyle bakestyle) {
        super("Fina", Arrays.asList("Barbacoa","Carne","Tomate","Cebolla","Maiz"),bakestyle);
    }



}
