package com.ue.insw.proyecto.exercises.ej4;


import java.util.Arrays;

public class CarbonaraPizza extends Pizza{

    public CarbonaraPizza(BakeStyle bakeStyle){

        super("Fina", Arrays.asList("Huevos", "Queso Parmesano", "aceita de oliva", "Pimienta Negra", "Pancetta"), bakeStyle);
    }
}