package com.ue.insw.proyecto.exercises.ej4;

import java.util.Arrays;
import java.util.List;

//todo extends pizza
public class BarbecuePizza extends Pizza {

   public BarbecuePizza(BakeStyle bakeStyle){
       super("Normal", Arrays.asList("Carne Picada","Beicon","Tomate","Queso rallado","Salsa Barbacoa", "Lea Perrins"), bakeStyle,10);
   }
}
