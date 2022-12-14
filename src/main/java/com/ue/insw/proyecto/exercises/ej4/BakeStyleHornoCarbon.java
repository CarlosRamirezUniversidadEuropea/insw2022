package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoCarbon extends BakeStyle{

     @Override
    public void bake(Pizza pizza){
         System.out.println("Cocinando la pizza"+pizza.toString()+
                 " con horno de carbón"+
                 " a un tiempo de 20 min");
     }
}
