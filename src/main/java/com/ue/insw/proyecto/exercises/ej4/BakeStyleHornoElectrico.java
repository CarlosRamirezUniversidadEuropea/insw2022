package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoElectrico extends BakeStyle{
    @Override
    public void bake(Pizza pizza){
        System.out.println("Cocinando la pizza"+pizza.toString()+
                " con horno electrico"+
                " a un tiempo de 10 min");
    }
}
