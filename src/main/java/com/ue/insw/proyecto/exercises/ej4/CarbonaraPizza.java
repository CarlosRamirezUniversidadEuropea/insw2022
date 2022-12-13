package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

public class CarbonaraPizza extends Pizza{
    public CarbonaraPizza(BakeStyle bakeStyle) {
        super("Fina", Arrays.asList("Bacon", "Queso Mozarella", "Champiñones", "Pimienta Negra"), bakeStyle);
    }
}
