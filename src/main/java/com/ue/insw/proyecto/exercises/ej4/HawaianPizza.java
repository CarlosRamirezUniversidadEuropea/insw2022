package com.ue.insw.proyecto.exercises.ej4;

import java.util.List;

//todo extends pizza
public class HawaianPizza extends Pizza{
    public HawaianPizza(BakeStyle bakeStyle){
        super("Normal", List.of("Mozzarella","Piña","Doble jamon de York"), bakeStyle);
    }
}
