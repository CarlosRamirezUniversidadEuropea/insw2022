package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{
    public HawaianPizza(BakeStyle bakeStyle){
        super("Normal", Arrays.asList("Mozzarella","Piña","Doble jamon de York"), bakeStyle,0);
    }
}
