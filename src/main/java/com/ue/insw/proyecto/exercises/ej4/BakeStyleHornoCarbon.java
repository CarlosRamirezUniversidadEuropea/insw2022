package com.ue.insw.proyecto.exercises.ej4;

public class BakeStyleHornoCarbon extends BakeStyle{

        public void bake (Pizza pizza){
            System.out.println("Preparando la pizza " + pizza.toString() +
                    "Hecha con: Horno y carbon "+
                    "tiempo: 25 min ");
        }
}
